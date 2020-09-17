package exception_handling;

import java.io.IOException;

public class ThrowsClause {

	public static void main(String[] args) {
		try {
			ThrowsClause objClause = new ThrowsClause();
			objClause.myMethod(1);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void myMethod(int num) throws IOException, ClassNotFoundException {

		if (num == 1) {
			throw new IOException("IOException Occurred");
		} else {
			throw new ClassNotFoundException("ClassNotFoundException");
		}

	}

}
