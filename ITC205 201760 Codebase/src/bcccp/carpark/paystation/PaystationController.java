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
	
	//This method can use for check status of ticket.
	public boolean checkBarcode(String Barcode){
            
            boolean Date_Time_MatchOK=true;
            boolean Ticket_Eject=true;
            
            //Retreive all data by using barcode from database and update above details
            
            if(Date_Time_MatchOK==true)
                return false;
            else if(Ticket_Eject==true)
                return false;
            else
                return true;
            
        }

	
	
}
