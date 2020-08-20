package section4;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(shouldWakeUp(true, -1));

	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		boolean bark = false;
		if (hourOfDay < 0 || hourOfDay > 23)
			return bark;

		if (barking && (hourOfDay < 8 || hourOfDay > 22))
			bark = true;
		return bark;
	}

}
