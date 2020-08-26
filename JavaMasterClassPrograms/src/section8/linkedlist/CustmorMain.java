package section8.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class CustmorMain {

	public static void main(String[] args) {
		
		Custmor custmor = new Custmor("Punam", 54.11);
		Custmor anotherCustmor = custmor;
		anotherCustmor.setBalance(12.34);
		System.out.println("Balance for custmor "+custmor.getNameString()+" is "+custmor.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);   //Behind scenes 1 is converted to Integer object - intList(Integer.valueOf(1)) 
		intList.add(3);
		intList.add(4);
		
		System.out.println();
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : "+intList.get(i));
		}
		
		intList.add(1,2);
		System.out.println();
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : "+intList.get(i));
		}
	}
	
}
