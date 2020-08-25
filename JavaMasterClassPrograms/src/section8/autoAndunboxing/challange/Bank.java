package section8.autoAndunboxing.challange;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branchesArrayList;

	public Bank(String name) {

		this.name = name;
		this.branchesArrayList = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branchesArrayList.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustmor(String branchName, String custmorName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustmor(custmorName, amount);
		}
		return false;
	}

	public boolean addCustmorTransaction(String branchName, String custmorName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustmorTransaction(custmorName, amount);
		}
		return false;
	}

	private Branch findBranch(String branchName) {

		for (int i = 0; i < this.branchesArrayList.size(); i++) {
			Branch checkedBranch = this.branchesArrayList.get(i);
			if (checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;

	}
	
	public boolean listCustmors(String branchName,boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Custmor Details for Branch : "+branch.getName());
			ArrayList<Custmor> branchCustmors = branch.getCustmors();
			for (int i = 0; i < branchCustmors.size(); i++) {
				Custmor branchCustmor = branchCustmors.get(i);
				System.out.println("Custmor: "+branchCustmor.getName()+"["+(i+1)+"]");
				if (showTransactions) {
					System.out.println("Transactions : ");
					ArrayList<Double> transactionsArrayList = branchCustmor.getTransactionsArrayList();
					for (int j = 0; j < transactionsArrayList.size(); j++) {
						System.out.println("["+(j+1)+"] Amount: "+transactionsArrayList.get(j));
					}
				}
			}
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
