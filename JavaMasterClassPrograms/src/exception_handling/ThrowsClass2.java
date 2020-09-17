package exception_handling;

public class ThrowsClass2 {

	public static void main(String[] args) {
		ThrowsClass2 obj = new ThrowsClass2();
		try {
			System.out.println(obj.division(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("You shouldn't divide number by zero");
		}
	}

	private int division(int i, int j) throws ArithmeticException {
		int div = i / j;
		return div;
	}

}
