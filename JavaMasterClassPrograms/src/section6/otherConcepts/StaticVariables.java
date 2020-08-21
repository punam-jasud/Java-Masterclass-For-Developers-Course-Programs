package section6.otherConcepts;

public class StaticVariables {

	public static void main(String[] args) {
		Doggy rexDoggy = new Doggy("rex"); // create instance (rexDoggy)
		Doggy fluffyDoggy = new Doggy("fluffy"); // create instance (fluffyDoggy)

		rexDoggy.printName(); // prints fluffy
		fluffyDoggy.printName(); // prints fluffy

	}

}

class Doggy {
	private static String nameString;

	public Doggy(String name) {
		Doggy.nameString = name;
	}

	public void printName() {
		System.out.println("Name : " + nameString);
	}
}

//Static variables are common to every object