package test;

public class BuddyInfo {

	private String name;
	private String address;
	private String number;
	
	public BuddyInfo(String name,String address, String number)
	{
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public BuddyInfo()
	{
	
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
		public static void main(String[] args) {
			BuddyInfo homer = new BuddyInfo();
			homer.setName("Homer");
			System.out.println("Hello my name is " + homer.getName());
			System.out.println("Hello world!");

		}
}
