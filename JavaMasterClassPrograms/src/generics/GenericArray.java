package generics;

//Note : Following statement causes compiler error; We Cannot create a generic array of T
//public T[] array = new T[5];

public class GenericArray<T> {

	private T[] myArray;

	public GenericArray(T[] myArray) {
		this.myArray = myArray;
	}

	void printArray() {
		for (T element : myArray) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'A', 'B', 'C', 'D', 'E' };

		System.out.println("Printing Integer Array");
		GenericArray<Integer> obj1 = new GenericArray<Integer>(intArray);
		obj1.printArray();

		System.out.println("Printing Character Array");
		GenericArray<Character> obj2 = new GenericArray<Character>(charArray);
		obj2.printArray();

	}

}
