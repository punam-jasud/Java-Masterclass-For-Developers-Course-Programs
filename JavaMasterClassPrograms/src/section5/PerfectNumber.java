package section5;

public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println(isPerfectNumber(6));
	}
	public static boolean isPerfectNumber(int number)
	{
		int sum = 0;
		
		if(number < 1)
			return false;
		int i = 1;
		while (i < number)  {
			
			if(number % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		if(sum == number)
			return true;
		return false;
	}

}
