package appliances;

public class DishWasher extends CleaningAppliance {

	public DishWasher(String name, String brand, String color, double weight, double price, boolean isBatteryIncluded,
			String material) {
		super(name, brand, color, weight, price, isBatteryIncluded, material);
	}

	@Override
	public void wash() {
		System.out.println("DishWasher is Washing Dishes");
	}

}
