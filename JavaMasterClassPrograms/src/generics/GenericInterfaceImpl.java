package generics;

class A implements GenericInterface<Integer> {

	@Override
	public Integer get() {
		return 24;
	}

}

class B implements GenericInterface<String> {

	@Override
	public String get() {

		return "Punam ";
	}

}

public class GenericInterfaceImpl {

	public static void main(String[] args) {

		GenericInterface<Integer> s1 = new A();
		GenericInterface<String> s2 = new B();

		System.out.println("Age: " + s1.get());
		System.out.println("Name : " + s2.get());

	}
}