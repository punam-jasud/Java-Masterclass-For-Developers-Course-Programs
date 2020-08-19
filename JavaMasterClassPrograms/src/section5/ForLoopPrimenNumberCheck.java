package section5;

public class ForLoopPrimenNumberCheck {

	public static void main(String[] args) {
		
		primeNumbers(15);
		

	}
	public  static void primeNumbers(int n) {
		
		for(int i = 0 ; i < n ; i++)
		{
			if(isPrime(i))
			{	
				System.out.println(i);
			}
		}
	}
	private static boolean isPrime(int i) {
		
		if(i == 1 || i == 0)
			return false;
		for (int j = 2; j <= i/2; j++) {
			
			if(i % j == 0)
				return false;
			
		}
		return true;
	}

}
