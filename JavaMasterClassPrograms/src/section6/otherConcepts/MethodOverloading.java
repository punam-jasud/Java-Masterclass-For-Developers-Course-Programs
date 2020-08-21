package section6.otherConcepts;

public class MethodOverloading { // same name different parameter

	public static void main(String[] args) {

		DogClass dogClass = new DogClass();
		dogClass.bark();
		dogClass.bark(3);
	}

}

class DogClass {
	public void bark() {
		System.out.println("Woof");
	}

	public void bark(int number) // Overloaded method one parameter
	{
		for (int i = 0; i < number; i++) {
			System.out.print("Woof ");
		}
	}
}
