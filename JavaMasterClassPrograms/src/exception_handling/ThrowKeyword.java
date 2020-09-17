package exception_handling;

/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("Welcome to the Registration process!!");
		checkEligibility(10, 39);
		System.out.println("Have a nice day..");
	}

	private static void checkEligibility(int age, int weight) {

		if (age < 12 && weight < 40) {
			throw new ArithmeticException("Student is not eligible for registration");
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}
}
