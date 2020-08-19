package section5;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(1010, 10));

	}
	public static int getGreatestCommonDivisor(int first , int second)
	{
		int gcd = 0 ;
		if(first < 10 || second < 10)
			return -1;
		
		int i = 1;
		while(i <= first && i <= second)
		{
			if((first % i == 0) && ((second % i) == 0))
			{
				gcd = i;
			}
			i++;
		}
		
		return gcd;
	}
}
