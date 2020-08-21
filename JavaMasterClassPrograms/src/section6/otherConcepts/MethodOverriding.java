package section6.otherConcepts;

public class MethodOverriding { // same name , same parameters

	public static void main(String[] args) {

		Yorkie yorkie = new Yorkie();
		yorkie.bark();

	}

}

class Dog {

	public void bark() {
		System.out.println("Woof");
	}

}

class Yorkie extends Dog {

	@Override
	public void bark() {

		System.out.println("Woof Woof Woof");
	}

}