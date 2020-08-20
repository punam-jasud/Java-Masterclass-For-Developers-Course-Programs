package section5;

public class EvenDigitSum {

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(12345678));

	}

	public static int getEvenDigitSum(int number) {
		int sum = 0, rem = 0;
		if (number < 0)
			return -1;

		while (number > 0) {
			rem = number % 10;
			if (rem % 2 == 0)
				sum = sum + rem;
			number = number / 10;
		}
		return sum;
	}

}
