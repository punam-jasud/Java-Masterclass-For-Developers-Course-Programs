package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayChallange {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int myInteger[] = getIntegers(5);
		int sorted[] = sortIntegers(myInteger);
		printArray(sorted);
	}

	private static int[] getIntegers(int numbers) {
		System.out.println("Enter " + numbers + " Integer values:");
		int[] values = new int[numbers];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " Contents: " + array[i]);
		}
	}

	private static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];   //First way to copy array
		}

		//sortedArray = Arrays.copyOf(array, array.length); //Second way to copy array
		
		boolean flag = true;
		int temp;

		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;

				}
			}
		}

		return sortedArray;

	}
}
