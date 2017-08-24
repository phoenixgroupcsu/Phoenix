/*
Name : W.M.M.R.N.Fernando
ID: 11634792
Assignment: Assignment 2
Subject name: Professional Programming Practice ITC515


*/
package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	
//This is the constructor
	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
		this.carpark=carpark;
		this.exitGate=exitGate;
		this.insideSensor=is;
		this.outsideSensor=os;
		this.ui=ui
	}



	@Override
	public void ticketInserted(String ticketStr) {
		if (state.equals(STATE.WAITING)) {
			if (ticketStr.substring(0, 1).equals('A')) {
				adhocTicket = carpark.getAdhocTicket(ticketStr);
				if (adhocTicket != null && adhocTicket.isPaid()) {
					setState(STATE.PROCESSED);
				} else {
					setState(STATE.REJECTED);
				}
			} else if (carpark.isSeasonTicketValid(ticketStr) && carpark.isSeasonTicketInUse(ticketStr)) {
				setState(STATE.PROCESSED);
				seasonTicketId = ticketStr;
			} else {
				ui.beep();
				setState(STATE.REJECTED);
			}
		} 
		else {
			ui.beep();
			ui.discardTicket();
			setState(STATE.REJECTED);
		}
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
