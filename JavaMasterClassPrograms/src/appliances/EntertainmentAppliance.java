package appliances;

public class EntertainmentAppliance extends HouseholdAppliance {

	public EntertainmentAppliance(String name, String brand, String color, double weight, double price) {
		super(name, brand, color, weight, price);
	}

	@Override
	public void displayApplianceDetails() {
		System.out.println("Entertainment Appliance Name : " + this.getName());
		System.out.println("Entertainment Appliance Brand : " + this.getBrand());
		System.out.println("Entertainment Appliance Price : " + this.getPrice());
		System.out.println("Entertainment Appliance Color : " + this.getColor());
		System.out.println("Entertainment Appliance Weight : " + this.getWeight() + " kg ");

	}

}
