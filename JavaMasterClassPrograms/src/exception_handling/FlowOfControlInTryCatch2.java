package exception_handling;

public class FlowOfControlInTryCatch2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;

		try {
			int num = x / y;
			System.out.println("next-statement: Inside try block");
		} catch (Exception e) {
			System.out.println("Exception Occurred");
		}
		System.out.println("next-statement: Outside of try-catch");

	}

}

/*
 * Point to note in above example: There are two statements present inside try
 * block. Since exception occurred because of first statement, the second
 * statement didn’t execute. Hence we can conclude that if an exception occurs
 * then the rest of the try block doesn’t execute and control passes to catch
 * block.
 */