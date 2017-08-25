package bcccp.tickets.adhoc;

import java.util.ArrayList;
import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	private List<IAdhocTicket> currentAdhocTickets;
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		//TODO Implement constructor
		currentTicketNo = 0;
		currentAdhocTickets = new ArrayList();
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		// TODO Auto-generated method stub
		currentTicketNo++;
		IAdhocTicket ticket = new AdhocTicket(carparkId, currentTicketNo, "BarCode");
		currentAdhocTickets.add(ticket);
		return ticket;
	}


	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
