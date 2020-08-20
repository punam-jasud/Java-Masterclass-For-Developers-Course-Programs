package section6.constructors;

public class BankAccountExcercise {

	private String accountNumber;
	private double balance;
	private String customorName;
	private String email;
	private String phone;

	public BankAccountExcercise() {
		this("000000000000", 0, "null", "default@gmail.com", "0000000000"); // will call second constructor with default
																			// values
		System.out.println("Empty Constructor called");
	}

	public BankAccountExcercise(String accountNumber, double balance, String customorName, String email, String phone) {
		System.out.println("Parameterized Constructor Called ");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customorName = customorName;
		this.email = email;
		this.phone = phone;
	}

	public BankAccountExcercise(String customorName, String email, String phone) {
		this("99999", 100.55, customorName, email, phone); // Will call second constructor
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getCustmorName() {
		return this.customorName;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustmorName(String custmorName) {
		this.customorName = custmorName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void depositFund(double balance) {
		System.out.println("Before Depositing " + balance + " , Total Balance is : " + this.balance);
		this.balance += balance;
		System.out.println("After Depositing " + balance + " , now Total Balance is : " + this.balance);
	}

	public void withdrawFund(double balance) {
		if (this.balance - balance < 0) {
			System.out.println("Balance Insufficient");

		} else {
			System.out.println("Before Withdrawing " + balance + " , Total Balance is : " + this.balance);
			this.balance -= balance;
			System.out.println("After Withdrawing " + balance + " , now Total Balance is : " + this.balance);
		}
	}

	public static void main(String[] args) {

		BankAccountExcercise custmor = new BankAccountExcercise();
		System.out.println("Name : " + custmor.getCustmorName() + " ,Account : " + custmor.getAccountNumber());

		custmor.setAccountNumber("123456789232");
		custmor.setBalance(1000);
		custmor.setCustmorName("Punam");
		custmor.setEmail("punamjasud@gmail.com");
		custmor.setPhone("9552902222");

		System.out.println();
		System.out.println();

		System.out.println("Name : " + custmor.getCustmorName() + " ,Account : " + custmor.getAccountNumber());
		custmor.depositFund(1500);
		custmor.withdrawFund(500);
		custmor.withdrawFund(2000);

		System.out.println();
		System.out.println();

		BankAccountExcercise custmor2 = new BankAccountExcercise("955290286012", 500, "Sangita", "sangita@gmail.com",
				"7887412190");
		System.out.println(custmor2.getCustmorName());
		System.out.println(custmor2.getBalance());

		System.out.println();
		System.out.println();

		BankAccountExcercise custmor3 = new BankAccountExcercise("Tim", "Tim@gmail.com", "898934567");
		System.out.println("Name : " + custmor3.getCustmorName() + " ,Account : " + custmor3.getAccountNumber());

	}

}
