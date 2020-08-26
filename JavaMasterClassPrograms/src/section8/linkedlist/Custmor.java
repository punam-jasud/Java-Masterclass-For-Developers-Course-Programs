package section8.linkedlist;

public class Custmor {
	
	private String nameString;
	private double balance;
	
	public Custmor(String nameString, double balance) {
		
		this.nameString = nameString;
		this.balance = balance;
	}

	public String getNameString() {
		return nameString;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
