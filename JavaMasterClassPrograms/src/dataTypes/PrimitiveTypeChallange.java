package dataTypes;

public class PrimitiveTypeChallange {

	public static void main(String[] args) {

		byte myByte = 20;
		short myShort = 150;
		int myInt = 500;
		long myLong = 50000L + 10L * (myByte + myInt + myShort);

		short myShortTotal = (short) (1000 + 10 * (myByte + myInt + myShort));

		System.out.println(myLong);
		System.out.println(myShortTotal);

	}

}
