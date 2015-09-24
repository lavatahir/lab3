
public class BuddyInfo {
	private String name;
	private String homeaddress;
	private String phonenumber;
	
	
	public BuddyInfo(String name, String homeaddress, String phonenumber){
		this.name = name;
		this.homeaddress = homeaddress;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHomeaddress() {
		return homeaddress;
	}
	
	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public static void main(String[] args){
		BuddyInfo buddy = new BuddyInfo("tom", "Carleton", "1234");
		AddressBook ab = new AddressBook();
		ab.addBuddy(buddy);
		ab.removeBuddy(buddy);
	}
}
