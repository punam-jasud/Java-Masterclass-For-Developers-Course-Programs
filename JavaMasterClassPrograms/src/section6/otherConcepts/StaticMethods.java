package section6.otherConcepts;

public class StaticMethods {

	public static void main(String[] args) {

		Calculator.printSum(5, 10);
		printHello(); // Shorter form of Main.printHello();
	}

	public static void printHello() {
		System.out.println("Hello");
	}
}

class Calculator {
	public static void printSum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}
}

/*
 * static methods are called as ClassName.methodName(); or methodName(); only if
 * in the same class
 * 
 * in this example Calculator.printSum(5,10); printHello();
 */