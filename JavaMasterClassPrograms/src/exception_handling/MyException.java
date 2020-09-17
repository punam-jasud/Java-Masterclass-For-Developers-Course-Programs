package exception_handling;

class CustomException extends Exception {
	private String str;

	public CustomException(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "MyException Ocurred : " + str;
	}
}

public class MyException {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new CustomException("This is my error message");
		} catch (CustomException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}

}
