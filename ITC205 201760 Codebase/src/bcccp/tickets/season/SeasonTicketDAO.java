/**
Team Name: Phoenix Group
Student Name: Rajesh Khadka
Student ID: 11614964
Subject Name: ITC 515 Professional programming practice
Lecturer: Recep Ulusoy
*/

package bcccp.tickets.season;

/** importing necessary package*/
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

/** class SeasonTicketDAO begins from here*/
public class SeasonTicketDAO implements ISeasonTicketDAO {

	private IUsageRecordFactory factory;
	
	public SeasonTicketDAO(IUsageRecordFactory factory) {
		//TOD Implement constructor
		this.factory = factory;
	}



	@Override
	public void registerTicket(ISeasonTicket ticket) {
		// TODO Auto-generated method stub
		this.ticket = ticket;
		
	}



	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ISeasonTicket findTicketById(String ticketId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void recordTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		this.ticketId = ticketid;
		
	}



	@Override
	public void recordTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
