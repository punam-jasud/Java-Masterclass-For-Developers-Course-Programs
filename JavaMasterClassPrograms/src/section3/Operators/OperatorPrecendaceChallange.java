package section3.Operators;

public class OperatorPrecendaceChallange {

	public static void main(String[] args) {

		double first = 20;
		double second = 80;

		boolean var = ((((first + second) * 100) % 40) == 0) ? true : false;
		System.out.println(var);

		if (var == false)
			System.out.println("Got some remainder");

	}

}
