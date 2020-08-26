package section8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
//		
//		placesToVisit.add("Sydney");
//		placesToVisit.add("Perth");
//		placesToVisit.add("Melbourne");
//		placesToVisit.add("Brisane");
//		placesToVisit.add("Canberra");
//		placesToVisit.add("Adlaide");
//		placesToVisit.add("Darwin");
//		
//		printLinkedList(placesToVisit);
//		
//		placesToVisit.add(1,"Alice Spring");  //Add city at 1st location
//		
//		printLinkedList(placesToVisit);
//		
//		placesToVisit.remove(4);
//		printLinkedList(placesToVisit);  //Remove city at index 4
//		
//		System.out.println();
//		System.out.println("Cities in order : ");
		
		addInOrder(placesToVisit,"Sydney");
		addInOrder(placesToVisit,"Perth");
		addInOrder(placesToVisit,"Melbourne");
		addInOrder(placesToVisit,"Brisane");
		addInOrder(placesToVisit,"Canberra");
		addInOrder(placesToVisit,"Adlaide");
		addInOrder(placesToVisit,"Darwin");
		
		printLinkedList(placesToVisit);
		
		addInOrder(placesToVisit, "Alice Spring");
		addInOrder(placesToVisit, "Darwin");
		
		printLinkedList(placesToVisit);
		
		visit(placesToVisit);
		

	}

	private static void printLinkedList(LinkedList<String> linkedList) {
		
		Iterator<String> iterator = linkedList.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("Now Visiting "+iterator.next());
			
		}
		System.out.println("=================================================");
		
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList , String newCity) {
		ListIterator<String> listIterator = linkedList.listIterator();
		
		while(listIterator.hasNext()) {
			int comparison = listIterator.next().compareTo(newCity);
			if (comparison == 0) {
				//equal , do not add
				System.out.println(newCity+" is already included");
				return false;
			}
			else if (comparison > 0) {
				//new city should append before this one
				//Brisbane--->Adlaide
				
				listIterator.previous();
				listIterator.add(newCity);
				return true;
			}else if (comparison < 0) {
				//Adlaide ----> Brisbane
				//move on next city
			}
		}
		listIterator.add(newCity);
		return true;
		
	}
	
	private static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if (cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
			return;
		}
		else {
			System.out.println("Now Visiting "+listIterator.next());
			printMenu();
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("Holiday (vaction) has over");
				quit = true;
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now visiting "+listIterator.next());
				}
				else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now visiting "+listIterator.previous());
				}
				else {
					System.out.println("We are at the start of the list");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Avaliable Actions : \npress");
		System.out.println("0 - to quit\n"+
						   "1 - to go to next city\n"+
						   "2 - to go previous city\n"+
						   "3 - to print menu option\n");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
