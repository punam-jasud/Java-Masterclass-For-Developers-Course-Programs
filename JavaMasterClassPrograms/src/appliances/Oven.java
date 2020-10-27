package appliances;

public class Oven extends KitchenAppliance {

	public Oven(String name, String brand, String color, double weight, double price) {
		super(name, brand, color, weight, price);

	}

	@Override
	public void cook() {
		System.out.println("Oven is baking food..");
	}

}
