package appliances;

public class CleaningAppliance extends HouseholdAppliance {
	private boolean isBatteryIncluded;
	private String material;

	public CleaningAppliance(String name, String brand, String color, double weight, double price,
			boolean isBatteryIncluded, String material) {
		super(name, brand, color, weight, price);
		this.isBatteryIncluded = isBatteryIncluded;
		this.material = material;
	}

	public String isBatteryIncluded() {
		String string = (isBatteryIncluded) ? "Yes" : "No";
		return string;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public void displayApplianceDetails() {
		System.out.println("Cleaning Appliance Name : " + this.getName());
		System.out.println("Cleaning Appliance Brand : " + this.getBrand());
		System.out.println("Cleaning Appliance Price : " + this.getPrice());
		System.out.println("Cleaning Appliance Color : " + this.getColor());
		System.out.println("Cleaning Appliance Weight : " + this.getWeight() + " kg");
		System.out.println("Battery Included : " + isBatteryIncluded());
		System.out.println("Material Used : " + this.getMaterial());

	}

	// Override this method in subclass
	public void wash() {
		System.out.println("Washing..."); // Default Implementation
	}

}
