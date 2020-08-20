package section5;

public class NumberToWords {

	public static void main(String[] args) {

		numberToWords(123);
	}

	public static void numberToWords(int number) {
		if (number < 0)
			System.out.println("Invalid Value");

		int digitCount = getDigitCount(number);
		int reversedNum = reverse(number);
		String numString = "";

		do {
			switch (reversedNum % 10) {
			case 0:
				numString += "Zero ";
				break;
			case 1:
				numString += "One ";
				break;
			case 2:
				numString += "Two ";
				break;
			case 3:
				numString += "Three ";
				break;
			case 4:
				numString += "Four ";
				break;
			case 5:
				numString += "Five ";
				break;
			case 6:
				numString += "Six ";
				break;
			case 7:
				numString += "Seven ";
				break;
			case 8:
				numString += "Eight ";
				break;
			case 9:
				numString += "Nine ";
				break;
			}
			reversedNum /= 10;
			digitCount -= 1;
		} while (digitCount > 0);

		System.out.println(numString);
	}

	public static int reverse(int number) {
		int reversedNum = 0;
		while (number != 0) {
			reversedNum += (number % 10);
			number /= 10;
			reversedNum *= 10;
		}
		return reversedNum / 10;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		int digitCount = 0;

		do {
			digitCount += 1;
			number /= 10;
		} while (number > 0);

		return digitCount;

	}

}
