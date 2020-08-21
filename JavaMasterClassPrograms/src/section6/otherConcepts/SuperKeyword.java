package section6.otherConcepts;

public class SuperKeyword {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.printMethod();

	}

}

class SuperClass { // Parent class aka super class

	public void printMethod() {
		System.out.println("Printed in Superclass");
	}

}

class SubClass extends SuperClass { // Subclass aka child class

	// Override method from parent
	@Override
	public void printMethod() {
		super.printMethod(); // call method in Superclass(parent)
		System.out.println("Printed in Subclass");
	}

}