package section5;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Year Of Birth : ");
		boolean hasNextInt = scanner.hasNextInt();

		if (hasNextInt) {
			int year = scanner.nextInt();

			scanner.nextLine(); // To handle Enter Key Issue

			System.out.println("Enter Name : ");
			String nameString = scanner.nextLine();

			int age = 2020 - year;
			if (age >= 0 && age <= 100)
				System.out.println("Your name is " + nameString + " and your age is " + age);
			else {
				System.out.println("Invalid Birth Year");
			}
		} else {
			System.out.println("Unable to parse year of birth");
		}
		scanner.close();

	}

}
