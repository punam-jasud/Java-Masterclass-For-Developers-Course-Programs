package exception_handling;

public class FlowOfControlInTryCatch {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;

		try {
			int num = x / y;
			System.out.println("next-statement: Inside try block");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("next-statement: Outside of try-catch");

	}

}

//In the above example exception didn’t occur in try block so catch block didn’t run.