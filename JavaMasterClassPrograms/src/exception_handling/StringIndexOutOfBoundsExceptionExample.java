package exception_handling;

public class StringIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		try {
			String string = "TimJohn";
			System.out.println(string.length());
			char c = string.charAt(0);
			c = string.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Ocurred!!");
		}

	}

}
