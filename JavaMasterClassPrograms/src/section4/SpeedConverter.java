package section4;

public class SpeedConverter {

	public static void main(String[] args) {
		double miles = toMilesPerHour(10.5);
		System.out.println(miles);

		printConversion(10.5);

	}

	private static long toMilesPerHour(double kiloMetersPerHour) {

		if (kiloMetersPerHour < 0) {
			return -1;
		}

		return Math.round(kiloMetersPerHour / 1.609);

	}

	private static void printConversion(double kiloMetersPerHour) {

		if (kiloMetersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHour = toMilesPerHour(kiloMetersPerHour);
			System.out.print(kiloMetersPerHour + " km/h = " + milesPerHour + " mi/h");
		}
	}

}
