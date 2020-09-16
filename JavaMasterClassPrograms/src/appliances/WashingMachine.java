package appliances;

public class WashingMachine extends CleaningAppliance {
	private int capacity;
	int voltage;

	public WashingMachine(String name, String brand, String color, double weight, double price,
			boolean isBatteryIncluded, String material, int capacity, int voltage) {
		super(name, brand, color, weight, price, isBatteryIncluded, material);

		this.capacity = capacity;
		this.voltage = voltage;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getVoltage() {
		return voltage;
	}

	@Override
	public void wash() {
		System.out.println("Washing Machine is Washing Clothes..");
	}

	@Override
	public void displayApplianceDetails() {
		super.displayApplianceDetails();
		System.out.println("Machine Capacity : " + this.getCapacity() + " kg");
		System.out.println("Machine Voltage : " + this.getVoltage() + " v");
	}

}
