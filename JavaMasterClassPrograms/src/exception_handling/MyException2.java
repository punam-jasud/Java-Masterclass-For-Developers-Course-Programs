package exception_handling;

class InvalidProductException extends Exception {

	public InvalidProductException(String s) {
		super(s);
	}
}

public class MyException2 {

	public static void main(String[] args) {
		MyException2 obj = new MyException2();
		try {
			obj.productCheck(60);
		} catch (InvalidProductException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}

	}

	private void productCheck(int weight) throws InvalidProductException {

		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}

	}

}
