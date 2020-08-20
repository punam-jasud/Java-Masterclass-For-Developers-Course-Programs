package section6.classes;

public class PersonExcercise {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {

		if (age < 0 || age > 100)
			this.age = 0;
		else
			this.age = age;
	}

	public boolean isTeen() {
		if (this.age > 12 && this.age < 20)
			return true;
		return false;
	}

	public String getFullName() {
		if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
			return "";
		}

		if (this.lastName.isEmpty())
			return this.firstName;

		if (this.firstName.isEmpty())
			return this.lastName;

		return this.firstName + " " + this.lastName;

	}

	public static void main(String[] args) {

		PersonExcercise person = new PersonExcercise();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(-5);
		System.out.println("FullName : " + person.getFullName());
		System.out.println("Is Teen : " + person.isTeen());
		System.out.println("Age : " + person.getAge());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("FullName :" + person.getFullName());
		System.out.println("Is Teen : " + person.isTeen());
		person.setLastName("Smith");
		System.out.println("FullName : " + person.getFullName());
	}

}
