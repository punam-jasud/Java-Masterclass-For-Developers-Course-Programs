package section5;

public class LastDigitChecker {

	public static void main(String[] args) {
		
		System.out.println(hasSameLastDigit(41, 22, 71));
	}
	public static boolean hasSameLastDigit(int first , int second , int third)
	{
		if(!(isValid(first) && isValid(second) && isValid(third)))
		{
			System.out.println("Wrong");
			return false;
		}
		
		int firstLastDigit = first % 10;
		int secondLastDigit = second % 10;
		int thirdLastDigit = third % 10;
		
		if((firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit))
			return true;
		
		return false;
	}
	public static boolean isValid(int number)
	{
		if(!(number >=10 && number <= 1000))
				return false;
		return true;
	}
}
