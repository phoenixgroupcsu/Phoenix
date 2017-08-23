/*
Student name: W.M.M.R.N.Fernando
Student ID: 11634792
Subject Name: ITC 515 Professiional programming practice
Due date: 25 August 2017
*/

package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

/*This class controll the entrance of the carpark*/
public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	
/*This is constructor of this class and when new entry calls this constructor will call*/
	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
		/*initialize the variables*/
		this.carpark=carpark;
		this.entryGate=entryGate;
		this.outsideSensor=os;
		this.insideSensor=is;
		this.ui=ui;
	}


/*This method issues a ticket after button pushed*/
	@Override
	public void buttonPushed() {
		if (state.equals(STATE.WAITING)) {
		if (!carpark.isFull()) {
		adhocTicket = carpark.issueAdhocTicket();
		
		int ticketNo = adhocTicket.getTicketNo();
		String carParkId = adhocTicket.getCarparkId();
		entryTime = System.currentTimeMillis();
		String barCode = adhocTicket.getBarcode();
		ui.printTicket(carParkId, ticketNo, entryTime, barCode);
		setState(STATE.ISSUED);
		} else {
		setState(STATE.FULL);
		}
		} else {
		ui.beep();
		}
		
	}


/*This method isses the tickect when new new entry */
	@Override
	public void ticketInserted(String barcode) {
	if (state.equals(STATE.WAITING)) {
	if (carpark.isSeasonTicketValid(barcode) && !carpark.isSeasonTicketInUse(barcode)) {
	this.seasonTicketId = barcode;
	setState(STATE.VALIDATED);
	}
	} else {
	ui.beep();
	}
		
	}


/*This method hendle tickettaken process*/
	@Override
	public void ticketTaken() {
	if (state.equals(STATE.ISSUED) || state.equals(STATE.VALIDATED)) {
	setState(STATE.TAKEN);
	} else {
	/*This part have to develope */
	}	
		
	}


//This method notify when some event occoured in the carpark
				   
	@Override
	public void notifyCarparkEvent() {
	if (state.equals(STATE.FULL)) {
	if (!carpark.isFull()) {
	setState(STATE.WAITING);
	}
	}
		
	}


//This method used to do the carpark event
	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		log("Car Event Detected: " + detectorId + "Car Detected" + detected);
		switch (state) {
	case BLOCKED:
	if (detectorId.equals(insideSensor.getId()) && !detected) {
	setState(initState);
	}
	break;
	case IDLE:
	if (detectorId.equals(insideSensor.getId()) && detected) {
	setState(STATE.WAITING);
	} else if (detectorId.equals(outsideSensor.getId()) && detected) {
	setState(STATE.BLOCKED);
	}
	case EXITED:
	if (detectorId.equals(insideSensor.getId()) && detected) {
	setState(STATE.EXITING);
	} else if (detectorId.equals(outsideSensor.getId()) && detected) {
	setState(STATE.IDLE);
	}
	// In-progress to do the further development
	default:
	break;
	}
		
		
	}
//Have to implement some more methods to support those methods
	
	
}
