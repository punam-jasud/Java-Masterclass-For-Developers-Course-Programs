package section8.arrays;

import java.util.Scanner;

public class SimpleArray {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element "+i+" typed value was : "+myIntegers[i]);
		}
		
		System.out.println("The Avarage is : "+getAvarage(myIntegers));

	}

	private static int[] getIntegers(int numbers) {
		System.out.println("Enter "+numbers+" Integer values:");
		int[] values = new int[numbers];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}

	public static double getAvarage(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return (double)sum/(double)array.length;
		
	}
}
