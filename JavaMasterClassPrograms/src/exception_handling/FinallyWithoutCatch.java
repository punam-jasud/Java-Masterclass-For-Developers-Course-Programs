package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FinallyWithoutCatch {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream input = null;
		try {
			input = new FileInputStream("inputfile.txt");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException exp) {
					System.out.println(exp);
				}
			}
		}
	}
}
