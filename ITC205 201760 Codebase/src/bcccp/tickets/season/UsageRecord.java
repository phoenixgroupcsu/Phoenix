package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	
	String ticketId;
	// start date and time of parking session
	long startDateTime;
	 // send date and time of parking session
	long endDateTime;
	
	// constructor
	public UsageRecord(String ticketId, long startDateTime) {
            //TODO Implement constructor
			
			 // initialize variables with data passed in parameters
            this.ticketId = ticketId;
			 this.startDateTime = startDateTime;
	}



	@Override
	public void finalise(long endDateTime) {
		// TODO Auto-generated method stub
		// put end date and time of parking session
		this.endDateTime = endDateTime; 
		
	}



	@Override
	public long getStartTime() {
		// TODO Auto-generated method stub
		return startDateTime; 
	}



	@Override
	public long getEndTime() {
		// TODO Auto-generated method stub
		return endDateTime;
	}



	@Override
	public String getSeasonTicketId() {
		// TODO Auto-generated method stub
		return return ticketId;
	}
	
	
	
}
