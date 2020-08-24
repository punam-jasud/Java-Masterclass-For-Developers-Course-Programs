package arrays;

import java.util.Scanner;

public class MinimumElementChallange {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Count : ");
		int count = scanner.nextInt();
		int returnedArray[] = readIntegers(count);
		int min = findMin(returnedArray);
		System.out.println("Minimum Element : "+min);

	}

	private static int findMin(int[] numbersArray) {
	
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < min) {
				
				min = numbersArray[i];
				
			}
		}
		
		return min;
	}

	private static int[] readIntegers(int count) {
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a Number : ");
			int number = scanner.nextInt();
			scanner.nextLine();
			array[i] = number;
		}
		return array;
	}

}
