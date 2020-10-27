
package appliances;

public class Microwave extends KitchenAppliance {

	public Microwave(String name, String brand, String color, double weight, double price) {
		super(name, brand, color, weight, price);

	}

	@Override
	public void cook() {
		System.out.println("Microwave is reheating food..");
	}

}
