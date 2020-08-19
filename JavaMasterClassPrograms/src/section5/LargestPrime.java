package section5;

public class LargestPrime {

	public static void main(String[] args) {
		
		System.out.println(getLargestPrime(21));

	}
	public static int getLargestPrime(int number) {
		
		int largestPrime = 0;
		if(number < 0 || number == 0 || number == 1)
			return -1;
		for (int i = 2 ; i < number; i++) {
			
			if(number % i == 0)
			{
				if (isPrime(i)) {
					largestPrime = i;
				}
				
			}
			
		}
		return largestPrime;
	}
	private static boolean isPrime(int n) {
		
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}

}
