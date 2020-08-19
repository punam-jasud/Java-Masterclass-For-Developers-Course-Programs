package section5;

public class DigitsSumChallange {

	public static void main(String[] args) {
		
		System.out.println(findDigitsSum(989));
	}
	public static int findDigitsSum(int number) {
		
		int sum = 0;
		if(number < 10)
			return -1;
		
		while(number > 0)
		{
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		
		return sum;
	}

}
