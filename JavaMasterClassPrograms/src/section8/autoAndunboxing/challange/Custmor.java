package section8.autoAndunboxing.challange;

import java.util.ArrayList;

public class Custmor {
	private String name;
	private ArrayList<Double> transactionsArrayList;
	
	public Custmor(String name , double initialAmount) {
		this.name = name;
		this.transactionsArrayList = new ArrayList<Double>();
		addTransaction(initialAmount);
	}
	
	public void addTransaction(double amount) {
		this.transactionsArrayList.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactionsArrayList() {
		return transactionsArrayList;
	}
	
	

}
