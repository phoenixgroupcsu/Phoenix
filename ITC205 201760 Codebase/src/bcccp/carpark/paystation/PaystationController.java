package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	ICarpark objcarpark;
        IPaystationUI objui;

	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		objcarpark=carpark;
                objui=ui;
	}


	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketPaid() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}

	
	
}
