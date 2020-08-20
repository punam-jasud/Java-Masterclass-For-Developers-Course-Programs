package section5;

public class FirstAndLastDigitsSum {

	public static void main(String[] args) {

		System.out.println(sumFirstAndLastDigit(-10));

	}

	public static int sumFirstAndLastDigit(int number) {
		int sum = 0, firstDigit = 0, lastDigit = 0;
		if (number < 0)
			return -1;

		lastDigit = number % 10;
		while (number > 0) {
			firstDigit = number % 10;
			number = number / 10;
		}
		sum = firstDigit + lastDigit;
		return sum;
	}
}
