package section5;

public class EvenNumber {

	public static void main(String[] args) {

		int number = 4;
		int finishNumber = 20;
		int count = 0;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number))
				continue;
			System.out.println(number);
			count++;
			if (count == 5)
				break;
		}
		System.out.println(count);

	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}
}
