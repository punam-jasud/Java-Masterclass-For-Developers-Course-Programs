package generics;

public class GenericMethod {

	private static <E> void printArray(E[] elements) {

		for (E element : elements) {
			System.out.println(element);

		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'A', 'B', 'C', 'D', 'E' };

		System.out.println("Printing Integer Array : \n");
		printArray(intArray);

		System.out.println("Printing Integer Array : \n");
		printArray(charArray);

	}

}
