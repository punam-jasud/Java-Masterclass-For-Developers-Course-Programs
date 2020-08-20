package Operators;

public class Logical {

	public static void main(String[] args) {

		int x = 10, y = 10, z = 20, m = 15;
		boolean var = false;

		if ((x < z) && (z > y))
			System.out.println("x is less than z and z is grater than y");

		if ((x > m) || (z > y))
			System.out.println("Demonstrating OR operator");

		if (!var)
			System.out.println("Demonstrating Not operator");

	}

}
