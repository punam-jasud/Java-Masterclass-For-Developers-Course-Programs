package section8.autoAndunboxing.challange;

public class Main {

	public static void main(String[] args) {

		
		Bank bank = new Bank("National Australia Bank");
		bank.addBranch("Adelaide");
		
		bank.addCustmor("Adelaide", "Tim", 50.05);
		bank.addCustmor("Adelaide", "Mike", 175.34);
		bank.addCustmor("Adelaide", "Percy", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustmor("Sydney", "Bob", 150.54);
		
		bank.addCustmorTransaction("Adelaide", "Tim", 44.22);
		bank.addCustmorTransaction("Adelaide", "Tim", 12.44);
		bank.addCustmorTransaction("Adelaide", "Tim", 1.65);
		
		bank.listCustmors("Adelaide", true);
		bank.listCustmors("Sydney", true);
		
		//bank.addBranch("Melbourne");
		
		if (!bank.addCustmor("Melbourne", "Brian", 5.53)) {
			System.out.println("Melbourne branch does not exists");
			
		}
		
		if (!bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch already exists");
			
		}
		
		if (!bank.addCustmorTransaction("Adelaide", "Fergus", 52.33)) {
			
			System.out.println("Custmor does not exists in Adelaide branch");
			
		}
		
		if (!bank.addCustmor("Adelaide","Tim", 12.21)) {
			System.out.println("Custmor Tim Already Exists..");
		}
	}

}
