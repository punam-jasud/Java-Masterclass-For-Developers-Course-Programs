package appliances;

public class KitchenAppliance extends HouseholdAppliance {

	public KitchenAppliance(String name, String brand, String color, double weight, double price) {
		super(name, brand, color, weight, price);

	}

	@Override
	public void displayApplianceDetails() {
		System.out.println("Kitchen Appliance Name : " + this.getName());
		System.out.println("Kitchen Appliance Brand : " + this.getBrand());
		System.out.println("Kitchen Appliance Price : " + this.getPrice());
		System.out.println("Kitchen Appliance Color : " + this.getColor());
		System.out.println("Kitchen Appliance Weight : " + this.getWeight() + " kg");

	}

	// Override method in subclasses
	public void cook() {
	}

}
