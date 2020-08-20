package section6.classes;

public class Main {

	public static void main(String[] args) {

		Car porscheCar = new Car();
		Car holdenCar = new Car();

		porscheCar.setModel("Carrera");
		holdenCar.setModel("123");
		System.out.println("Porsche Car Model : " + porscheCar.getModel());
		System.out.println("Holden Car Model : " + holdenCar.getModel());

	}

}
