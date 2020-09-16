package exception_handling;

public class FinallyBlockWithReturn {

	public static void main(String[] args) {

		System.out.println(FinallyBlockWithReturn.myMethod());

	}

	private static int myMethod() {
		try {
			return 112;
		} finally {
			System.out.println("This is Finally block");
			System.out.println("Finally block ran even after return statement");

		}
	}

}
