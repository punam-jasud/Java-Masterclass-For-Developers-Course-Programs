package section5;

import java.util.Scanner;

public class PrintSumAndAvarage {

	public static void main(String[] args) {

		inputThenPrintSumAndAvarage();
	}

	public static void inputThenPrintSumAndAvarage() {
		Scanner scanner = new Scanner(System.in);

		int sum = 0, count = 0;
		long avg = 0;

		while (true) {
			System.out.println("Enter Number : ");
			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();
				sum = sum + number;
				count++;
			} else {
				avg = Math.round((double) sum / count);
				System.out.println("SUM = " + sum + " AVG = " + avg);
				break;
			}
			scanner.nextLine();
		}
		scanner.close();
	}
}
