package section4;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(525600);
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			int hours = (int) (minutes / 60);
			int days = (hours / 24);
			int years = (days / 365);
			int newhDays = days % 365;
			System.out.println(minutes + " min = " + years + " y and " + newhDays + " d");
		}
	}

}
