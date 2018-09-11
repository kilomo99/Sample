package test;

import java.util.ArrayList;

public class AddressBook {
	
	private static ArrayList<BuddyInfo> phoneBook = new ArrayList<BuddyInfo>();
	private int currentSize = phoneBook.size();

	public static void main(String[] args) {
	
		System.out.println("Address Book");
		BuddyInfo bud = new BuddyInfo("phil","address1","phone#");
		AddBuddy(bud);
		System.out.println(phoneBook);
		RemoveBuddy(0);
		System.out.println(phoneBook);

	}
	
	public static void AddBuddy(BuddyInfo buddy)
	{
		if(buddy != null)
		{
			phoneBook.add(buddy);
		}
	}
	
	public static void RemoveBuddy(int index)
	{
		if(index >= 0 && phoneBook.size() >= index)
		{
			phoneBook.remove(index);
		}
	}

}
