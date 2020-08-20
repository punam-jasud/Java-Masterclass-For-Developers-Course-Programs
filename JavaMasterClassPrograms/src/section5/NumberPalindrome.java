package section5;

public class NumberPalindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome(-1221));
	}

	public static boolean isPalindrome(int number) {
		int temp = Math.abs(number), revNumber = 0;
		number = Math.abs(number);
		while (number > 0) {
			int rem = number % 10;
			revNumber = revNumber * 10 + rem;
			number = number / 10;
		}
		if (temp == revNumber) {
			return true;
		}
		return false;
	}
}
