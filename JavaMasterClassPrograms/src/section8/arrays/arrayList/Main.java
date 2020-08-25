package section8.arrays.arrayList;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

	public static void main(String[] args) {

		boolean quit = false;
		startPhone();
		printActions();
		while (!quit) {
			System.out.println("\nEnter action: (6 to show avaliable actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Shuting Down..!");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			default:
				break;
			}
		}

	}

	private static void addNewContact() {
		System.out.println("Enter a new contact name:  ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number:  ");
		String phone = scanner.nextLine();
		
		Contact newContact = Contact.createContact(name, phone);
		if (mobilePhone.addNewContact(newContact)) {
			System.out.println("New Contact Added: Name = "+name+" , Phone = "+phone);
		}else {
			System.out.println("Cannot add , "+name+" already on file");
		}
		
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Enter a new contact name:  ");
		String newName = scanner.nextLine();
		System.out.println("Enter phone number:  ");
		String newPhone = scanner.nextLine();
		
		Contact newContact = Contact.createContact(newName, newPhone);
		if (mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Succesfully Updated Record!");
		}
		else {
			System.out.println("Error updating record");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		if (mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully Deleted!");
		}
		else {
			System.out.println("Error Deleting Contact");
		}
	}


	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name : "+existingContactRecord.getName()+" Phone : "+existingContactRecord.getPhoneNumber());
	}

	
	

	private static void startPhone() {
		System.out.println("Starting Phone..!");

	}

	private static void printActions() {
		System.out.println("\nAvaliable Actions:\npress");
		System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + "2 - to add a new contact\n"
				+ "3 - to update an existing contact\n" + "4 - to remove an exising contact\n"
				+ "5 - to query to check if contact exists\n" + "6 - to print a list of  avaliable actions\n");
		System.out.println("Choose your action: ");
	}

}
