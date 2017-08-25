/*
************
//Developer Name:Dilanka  , CSU Student No:11618264 , Subject : ITC 515 Professional programming practice, instructor:Recep Ulusoy 
//This class "PaystationController" developed for function all the payment related activity
************
*/

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
	
            if (checkBarcode(barcode)==true) {
                String Out= Double.toString(calculateCharges(barcode));
                objui.display("Balance :" + Out);
            }
            else{
                objui.display("Go to the office");
            }
		
	}


	@Override
	public void ticketPaid() {
            
            boolean successPayment=false;
            String Barcode=""; 
            
            //Getdata current barcode of ticket
            Barcode ="1231332";
                    
            //Update all payment to database
            
            successPayment=true;
            
           
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

	//this methode use for calculate parking charges
	 public double calculateCharges(String Barcode){
            
           double Amount =0;
            
            //Retreive all data by using barcode from database and Calculate Charges
            Amount=0;
            
            return Amount;
        }
	
	
}
