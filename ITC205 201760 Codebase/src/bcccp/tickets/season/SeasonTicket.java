/**
Team Name: Phoenix Group
Student Name: Rajesh Khadka
Student ID: 11614964
Subject Name: ITC 515 Professiional programming practice
Lecturer: Recep Ulusoy
*/

package bcccp.tickets.season;

/** importing necessary java utility libraries */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** class SeasonTicket begins from here */
public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	// defining variable of type string
	private String ticketId;
	private String carparkId;
	
	// defining variable of type long
	private long startValidPeriod;
	private long endValidPeriod;
	
	// defining constructor for the ISeasonTicket class
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		//TDO Implement constructor
		// initializing variables with data passed in parameters
		
		this.ticketId = ticketId;
		this.carparkId = carparkId;
		this.startValidPeriod = startValidPeriod;
		this.endValidPeriod = endValidPeriod;
		
	}

	@Override
	public String getTicketId() {
		// TODO Auto-generated method stub
		this.ticketId = ticketId;
		return ticketId;
	}

	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		//this.carparkId = carparkId;
		return carparkId;
	}

	@Override
	public long getStartValidPeriod() {
		// TODO Auto-generated method stub
		return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		// TODO Auto-generated method stub
		return endValidPeriod;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}
