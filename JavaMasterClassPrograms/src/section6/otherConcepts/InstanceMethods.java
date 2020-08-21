package section6.otherConcepts;

public class InstanceMethods {

	public static void main(String[] args) {
		DogExample rex = new DogExample(); // create Instance
		rex.bark(); // call Instance Method

	}

}

class DogExample {
	public void bark() {
		System.out.println("Woof");
	}
}