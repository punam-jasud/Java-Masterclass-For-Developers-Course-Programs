package exception_handling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			String string = null;
			System.out.println(string.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Ocurred..");
		}

	}

}
