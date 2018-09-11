package test;

import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> phoneBook = new ArrayList<BuddyInfo>();
	private int currentSize = phoneBook.size();

	public static void main(String[] args) {
	
		System.out.println("Address Book");

	}
	
	public void AddBuddy(BuddyInfo buddy)
	{
		if(buddy != null)
		{
			phoneBook.add(buddy);
		}
	}
	
	public void RemoveBuddy(int index)
	{
		if(index >= 0 && phoneBook.size() >= index)
		{
			phoneBook.remove(index);
		}
	}

}
