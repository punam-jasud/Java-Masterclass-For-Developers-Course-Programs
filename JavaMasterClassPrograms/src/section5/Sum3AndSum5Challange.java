package section5;

public class Sum3AndSum5Challange {

	public static void main(String[] args) {

		int count = 0, sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				sum = sum + i;
				count++;
				System.out.println("Found number : " + i);

			}

			if (count == 5)
				break;
		}
		System.out.println("Sum : " + sum);
	}

}
