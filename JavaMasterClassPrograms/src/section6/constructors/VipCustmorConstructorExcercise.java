package section6.constructors;

public class VipCustmorConstructorExcercise {

	private String nameString;
	private int creditLimit;
	private String emailString;

	public VipCustmorConstructorExcercise() {
		this("xyz", 5000, "default@gmail.com");
		System.out.println("Empty Constructor called");
	}

	public VipCustmorConstructorExcercise(String nameString, int creditLimit) {

		this(nameString, creditLimit, "default@gmail.com");
	}

	public VipCustmorConstructorExcercise(String nameString, int creditLimit, String emailString) {
		System.out.println("Parameterized constructor called");
		this.nameString = nameString;
		this.creditLimit = creditLimit;
		this.emailString = emailString;
	}

	public String getNameString() {
		return nameString;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmailString() {
		return emailString;
	}

	public static void main(String[] args) {

		VipCustmorConstructorExcercise vip1 = new VipCustmorConstructorExcercise();
		System.out.println("\nName : " + vip1.getNameString() + " \nEmail : " + vip1.getEmailString() + " \nLimit : "
				+ vip1.getCreditLimit());

		System.out.println();

		VipCustmorConstructorExcercise vip2 = new VipCustmorConstructorExcercise("Punam", 1000);
		System.out.println("\nName : " + vip2.getNameString() + " \nEmail : " + vip2.getEmailString() + " \nLimit : "
				+ vip2.getCreditLimit());

		System.out.println();

		VipCustmorConstructorExcercise vip3 = new VipCustmorConstructorExcercise("John", 5000, "john@gmail.com");
		System.out.println("\nName : " + vip3.getNameString() + " \nEmail : " + vip3.getEmailString() + " \nLimit : "
				+ vip3.getCreditLimit());
	}

}
