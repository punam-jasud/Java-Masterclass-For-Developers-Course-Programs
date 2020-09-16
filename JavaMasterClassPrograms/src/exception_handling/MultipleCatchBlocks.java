package exception_handling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		try {

			int a[] = new int[7];
			// a[4] = 30 / 0;
			a[10] = 10 / 5;
			System.out.println("Last Statement of try block");

		} catch (ArithmeticException e) {

			System.out.println("Warning: ArithmeticException");
			System.out.println("You should not divide a number by zero");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
			System.out.println("Accessing array elements outside of the limit");

		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}

		System.out.println("Out of try-catch block...");

	}

}
