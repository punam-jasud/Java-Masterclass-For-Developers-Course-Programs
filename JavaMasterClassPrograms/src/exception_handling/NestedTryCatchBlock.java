package exception_handling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {

		// main try-block
		try {
			// try-block2
			try {
				// try-block3
				try {
					int a[] = { 1, 2, 3, 4 };
					System.out.println(a[10]);
				} catch (ArithmeticException e) {
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in try-block3");
				}

			} catch (ArithmeticException e) {
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in try-block2");
			}
		} catch (ArithmeticException e) {
			System.out.print("Arithmetic Exception");
			System.out.println(" handled in main try-block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		} catch (Exception e) {
			System.out.print("Exception");
			System.out.println(" handled in main try-block");
		}

	}

}
