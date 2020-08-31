package appliances;

public abstract class HouseholdAppliance implements IApplianceFunctions {
	
	private String name;
	private String brand;
	private String color;
	private double weight;
	private double price;
	
	public HouseholdAppliance(String name, String brand, String color, double weight, double price) {
	
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.weight = weight;
		this.price = price;
	}
	
	
	//Non-abstract Method
	
	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Please Wait Turning On "+this.getName()+"..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off "+this.getName()+"..");
		
	}

	@Override
	public void clean() {
		System.out.println("Cleaning "+this.getName()+"..");
		
	}
	
	//Abstract Method
	public abstract void displayApplianceDetails();
	

}
