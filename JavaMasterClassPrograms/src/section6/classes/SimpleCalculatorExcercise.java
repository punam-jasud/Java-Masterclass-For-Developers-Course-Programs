package section6.classes;

public class SimpleCalculatorExcercise {

	private double firstNumber;
	private double secondNumber;

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}

	public double getSubtractionResult() {
		return firstNumber - secondNumber;
	}

	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}

	public double getDivisionResult() {
		if (this.secondNumber == 0) {
			return 0;
		}
		return firstNumber / secondNumber;
	}

	public static void main(String args[]) {
		SimpleCalculatorExcercise calculator = new SimpleCalculatorExcercise();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("Addition = " + calculator.getAdditionResult());
		System.out.println("Subtraction = " + calculator.getSubtractionResult());
		System.out.println("Multiplication = " + calculator.getMultiplicationResult());
		System.out.println("Division = " + calculator.getDivisionResult());

		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("\nMultiplication = " + calculator.getMultiplicationResult());
		System.out.println("Division = " + calculator.getDivisionResult());

	}

}
