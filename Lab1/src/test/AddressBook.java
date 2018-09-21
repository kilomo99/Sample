package test;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private ArrayList<BuddyInfo> sample;

	public AddressBook()
	{
		this.sample = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		if(buddy != null)
		{
			this.sample.add(buddy);
		}
	}
	
	public void removeBuddy(int index)
	{
		if(index >= 0 && this.sample.size() > index)
		{
			this.sample.remove(index);
		}
	}
	
	
	public static void main(String[] args) 
	{
		BuddyInfo bud = new BuddyInfo("phil","address1","phone#");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(bud);
		addressBook.removeBuddy(0);

	}
	

}
