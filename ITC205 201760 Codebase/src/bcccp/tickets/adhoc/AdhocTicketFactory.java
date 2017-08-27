/**
Team Name: Phoenix Group
Student Name: Rajesh Khadka
Student ID: 11614964
Subject Name: ITC 515 Professiional programming practice
Lecturer: Recep Ulusoy
*/

package bcccp.tickets.adhoc;

/** class AdhocTicketFactory begins from here*/
public class AdhocTicketFactory implements IAdhocTicketFactory {

	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		// TODO Auto-generated method stub
		// initializing variables with data passed in parameters
		this.carparkId = carparkId;
		this.ticketNo = ticketNo;
		return null;
	}


}
