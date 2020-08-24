package section3.Operators;

public class ArithmeticAndAssignment {

	public static void main(String[] args) {

		// Arithmetic operators
		int add = 10 + 20;
		int sub = 20 - 10;
		int mul = 10 * 20;
		int div = 20 / 5;
		int modulo = 20 % 3;

		int inc = 5;
		inc++;

		int dec = 5;
		dec--;

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(modulo);
		System.out.println(inc);
		System.out.println(dec);

		// Assignment operators
		int x = 10;
		add += 10; // 40
		sub -= 5; // 5
		mul *= 2; // 400
		div /= 2; // 2
		modulo %= 2; // 0

		System.out.println("");
		System.out.println(x);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(modulo);
	}

}
