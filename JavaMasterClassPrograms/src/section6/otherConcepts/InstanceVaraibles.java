package section6.otherConcepts;

public class InstanceVaraibles {

	public static void main(String[] args) {
		Doggy2 rexDoggy2 = new Doggy2("rex"); // create instance(rexDoggy2)
		Doggy2 fluDoggy2 = new Doggy2("fluffy"); // create instance(fluffyDoggy2)

		rexDoggy2.printName(); // prints rex
		fluDoggy2.printName(); // prints fluffy

	}

}

class Doggy2 {
	private String nameString;

	public Doggy2(String namString) {
		this.nameString = namString;
	}

	public void printName() {
		System.out.println("Name = " + nameString);
	}
}

//Instance variables are specific to each instance (Different for each object)