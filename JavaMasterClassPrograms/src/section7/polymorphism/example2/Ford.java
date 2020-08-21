package section7.polymorphism.example2;

class Ford extends Car{

	public Ford(int cylinders, String nameString) {
		super(cylinders, nameString);
	
	}

	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> brake()";
	}
	
	
	
}