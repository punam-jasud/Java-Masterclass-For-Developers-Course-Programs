package appliances;

public class Tv extends EntertainmentAppliance {

	private String screenType;
	private int screenWidth;
	private int screenHeight;
	private String features;

	public Tv(String name, String brand, String color, double weight, double price, String screenType, int screenWidth,
			int screenHeight, String features) {
		super(name, brand, color, weight, price);

		this.screenType = screenType;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.features = features;
	}

	public String getScreenType() {
		return screenType;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public String getFeatures() {
		return features;
	}

	@Override
	public void displayApplianceDetails() {
		super.displayApplianceDetails();
		System.out.println("Tv Screen Type : " + this.getScreenType());
		System.out.println("Tv Screen Width : " + this.getScreenWidth());
		System.out.println("Tv Screen Height : " + this.getScreenHeight());
		System.out.println("Tv Features : " + this.getFeatures());

	}

}
