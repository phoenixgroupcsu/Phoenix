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



	@Override
	public void buttonPushed() {
		// TODO Auto-generated method stub
		
	}


/*This method isses the tickect when new new entry */
	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void notifyCarparkEvent() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
