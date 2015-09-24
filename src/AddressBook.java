import java.util.*;
//hellllllooooooo
public class AddressBook {
	private LinkedList<BuddyInfo> addressbook;
	
	public AddressBook(){
		addressbook = new LinkedList<BuddyInfo>();		
	}
	
	public void addBuddy(BuddyInfo buddy){
		addressbook.add(buddy);
		System.out.println("Buddy " + buddy.getName() +" has been added.");

	}
	public void printbook(){
		for(BuddyInfo b: addressbook){
			System.out.println("Name: " + b.getName() + "\nAddress: " + b.getHomeaddress() + "\n");
		}
	}
	public void removeBuddy(BuddyInfo buddy){
		if(addressbook.contains(buddy)){
			addressbook.remove(buddy);
			System.out.println("Buddy " + buddy.getName() +" has been removed.");
		}
		else{
			System.out.println("Buddy " + buddy.getName() +" is not on the address book.");
		}
	}
	public static void main(String[] args){
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("me", "123 LOLO", "123-1244-32542315");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.printbook();
		book.removeBuddy(buddy);
	}
}
