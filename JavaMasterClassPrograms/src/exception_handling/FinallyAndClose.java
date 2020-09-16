package exception_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class FinallyAndClose {
	public static void main(String[] args) {
		try {
			OutputStream osf = new FileOutputStream("filename");
			OutputStream osb = new BufferedOutputStream(osf);
			ObjectOutput op = new ObjectOutputStream(osb);
			try {
				// output.writeObject(writableObject);
			} finally {
				op.close();
			}
		} catch (IOException e1) {
			System.out.println(e1);
		}
	}
}
