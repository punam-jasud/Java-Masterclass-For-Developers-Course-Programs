package section5;

public class AllFactors {

	public static void main(String[] args) {

		printFactors(6);

	}

	public static void printFactors(int number) {
		if (number < 0)
			System.out.println("Invalid Value");
		int i = 1;
		while (i <= number) {
			if (number % i == 0)
				System.out.println(i);
			i++;
		}
	}
}
