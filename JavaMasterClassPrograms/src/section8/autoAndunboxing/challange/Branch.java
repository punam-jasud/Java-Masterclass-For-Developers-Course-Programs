package section8.autoAndunboxing.challange;

import java.util.ArrayList;

public class Branch {
	
	private String name;
	private ArrayList<Custmor> custmors;
	
	public Branch(String name) {
		
		this.name = name;
		this.custmors = new ArrayList<Custmor>();
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Custmor> getCustmors() {
		return custmors;
	}
	
	public boolean newCustmor(String custmorName,double initialAmount) {
		if(findCustmor(custmorName) == null) {
			this.custmors.add(new Custmor( custmorName, initialAmount));
			return true;
		}
		
		return false;
	}
	
	public boolean addCustmorTransaction(String custmorName,double amount) {
		Custmor existingCustmor = findCustmor(custmorName);
		if(existingCustmor != null) {
			existingCustmor.addTransaction(amount);
			return true;
		}
		
		return false;
	}
	
	private Custmor findCustmor(String custmorName) {
		
		for (int i = 0; i < this.custmors.size(); i++) {
			Custmor checkedCustmor = this.custmors.get(i);
			if (checkedCustmor.getName().equals(custmorName)) {
				return checkedCustmor;
			}
		}
		return null;
		
	}

	
}
