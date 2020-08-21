package section7.polymorphism.example2;

class Car{
	private boolean engine;
	private int cylinders;
	private String nameString;
	private int wheels;
	
	public Car(int cylinders, String nameString) {
		
		this.cylinders = cylinders;
		this.nameString = nameString;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getNameString() {
		return nameString;
	}
	
	public String startEngine()
	{
		return "Car -> startEngine()";
	}
	
	public String accelerate() {
		return "Car -> accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}
}

class Mitssubishi extends Car{

	public Mitssubishi(int cylinders, String nameString) {
		super(cylinders, nameString);
	
	}

	@Override
	public String startEngine() {
		return "Mitssubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitssubishi -> accelerate()";
	}

	@Override
	public String brake() {
		return "Mitssubishi -> brake()";
	}
	
	
	
}


public class Cars {
	
	public static void main(String args[])
	{
		Car car = new Car(8, "Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		System.out.println();
		
		Mitssubishi mitssubishi = new Mitssubishi(6, "Outlander VRW 4WD");
		System.out.println(mitssubishi.startEngine());
		System.out.println(mitssubishi.accelerate());
		System.out.println(mitssubishi.brake());
		
		System.out.println();
		
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
	}
	

}
