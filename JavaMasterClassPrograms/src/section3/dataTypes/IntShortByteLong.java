package section3.dataTypes;

public class IntShortByteLong {

	public static void main(String[] args) {

		// int data type
		int myIntMinValue = Integer.MIN_VALUE;
		int myIntMaxValue = Integer.MAX_VALUE;
		System.out.println("Int Min Value : " + myIntMinValue);
		System.out.println("Int Max Value : " + myIntMaxValue);
		System.out.println("Busted Min Int Value : " + (myIntMinValue - 1));
		System.out.println("Busted Max Int Value : " + (myIntMaxValue + 1));

		System.out.println("");
		System.out.println("");

		// short data type
		short myShortMinValue = Short.MIN_VALUE;
		short myShortMaxValue = Short.MAX_VALUE;
		System.out.println("Short Min Value : " + myShortMinValue);
		System.out.println("Short Max Value : " + myShortMaxValue);
		myShortMinValue = (short) (myShortMinValue - 1);
		myShortMaxValue = (short) (myShortMaxValue + 1);
		System.out.println("Busted Min Short Value : " + myShortMinValue);
		System.out.println("Busted Max Short Value : " + myShortMaxValue);

		System.out.println("");
		System.out.println("");

		// byte data type//byte data type
		byte myByteMinValue = Byte.MIN_VALUE;
		byte myByteMaxValue = Byte.MAX_VALUE;
		System.out.println("Byte Min Value : " + myByteMinValue);
		System.out.println("Byte Max Value : " + myByteMaxValue);
		myByteMinValue = (byte) (myByteMinValue - 1);
		myByteMaxValue = (byte) (myByteMaxValue + 1);
		System.out.println("Busted Min Byte Value : " + myByteMinValue);
		System.out.println("Busted Max Byte Value : " + myByteMaxValue);

		System.out.println("");
		System.out.println("");

		// long data type
		long myLongMinValue = Long.MIN_VALUE;
		long myLongMaxValue = Long.MAX_VALUE;
		System.out.println("Long Min Value : " + myLongMinValue);
		System.out.println("Long Max Value : " + myLongMaxValue);
		myLongMinValue = (long) (myLongMinValue - 1);
		myLongMaxValue = (long) (myLongMaxValue + 1);
		System.out.println("Busted Min Long Value : " + myLongMinValue);
		System.out.println("Busted Max Long Value : " + myLongMaxValue);

		System.out.println("");
		System.out.println("");

		// char data type
		char myCharMinValue = Character.MIN_VALUE;
		char myCharMaxValue = Character.MAX_VALUE;
		System.out.println("Char Min Value : " + myCharMinValue);
		System.out.println("Char Max Value : " + myCharMaxValue);
		myCharMinValue = (char) (myCharMinValue - 1);
		myCharMaxValue = (char) (myCharMaxValue + 1);
		System.out.println("Busted Min Char Value : " + myCharMinValue);
		System.out.println("Busted Max Char Value : " + myCharMaxValue);

	}

}
