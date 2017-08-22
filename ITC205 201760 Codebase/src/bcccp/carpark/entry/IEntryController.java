package bcccp.carpark.entry;
/*this is comment*/
public interface IEntryController {
	
	public void buttonPushed();
	public void ticketInserted(String barcode);
	public void ticketTaken();

}
