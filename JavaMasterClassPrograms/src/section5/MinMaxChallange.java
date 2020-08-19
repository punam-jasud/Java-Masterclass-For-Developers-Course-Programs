package section5;

import java.util.Scanner;

public class MinMaxChallange {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		int max = 0 , min = 0;
		boolean first = true;
		
		while(true)
		{
			System.out.println("Enter Number : ");
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt)
			{
				int number = scanner.nextInt();
				if(first)
				{
					first = false;
					min = number;
					max = number;
				}
				
				if (number < min) {
					min = number;
				}
				
				if(number > max)
					max = number;
			}
			else {
				break;
			}
			scanner.nextLine();
		}
		System.out.println("Min = "+min+" , Max = "+max);
		scanner.close();

	}

}
