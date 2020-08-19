package section5;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 13));

	}
	public static boolean hasSharedDigit(int first , int second)
	{
		if(!((first >=10 && first <= 99) && (second >=10 && second <= 99)))
		{
			System.out.println("Wrong");
			return false;
		}
		
		while(first > 0)
		{
			int firstRem = first % 10;
			int temp = second;
			while(temp > 0)
			{
				int secondRem = temp % 10;
				if (firstRem == secondRem) {
					return true;
				}
				temp = temp / 10;
			}
			first = first / 10;
		}
		return false;
	}
}
