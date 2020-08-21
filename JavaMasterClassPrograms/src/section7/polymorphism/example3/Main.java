package section7.polymorphism.example3;

class TV {

	private String brand;
	private String screenType;
	private int screenWidth;
	private int screenHeight;
	private String tvFeatures;

	public TV(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {

		this.brand = brand;
		this.screenType = screenType;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.tvFeatures = tvFeatures;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getTvFeatures() {
		return tvFeatures;
	}

	public void turnOn() {
		System.out.println("Turning on..."); // Default implementation
	}

	public void turnOff() {
		System.out.println("Turning off..."); // Default implementation
	}

}

class SmartTV extends TV {

	public SmartTV(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
		super(brand, screenType, screenWidth, screenHeight, tvFeatures);

	}

	@Override
	public void turnOn() {

		System.out.println("Please Wait Turning On " + this.getBrand() + " ..."); // Overidden method to give specific
																					// behaviour
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off " + this.getBrand() + " ..."); // Overidden method to give specific
																					// behaviour
	}

}

class androidTV extends TV {

	public androidTV(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
		super(brand, screenType, screenWidth, screenHeight, tvFeatures);

	}

	@Override
	public void turnOn() {

		System.out.println("Please Wait Turning On " + this.getBrand() + " ..."); // Overidden method to give specific
																					// behaviour
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off " + this.getBrand() + " ..."); // Overidden method to give specific
																					// behaviour
	}

}

public class Main {

	public static void main(String[] args) {

		TV smartTV = new SmartTV("Mi TV", "LED", 900, 600, "quad-core,cortex A53 processor,Mail-450 Processor");
		smartTV.turnOn();
		System.out.println();
		System.out.println("Brand : " + smartTV.getBrand());
		System.out.println("Screen : " + smartTV.getScreenType());
		System.out.println("Screen Width: " + smartTV.getScreenWidth());
		System.out.println("Screen Height: " + smartTV.getScreenHeight());
		System.out.println("Features : " + smartTV.getTvFeatures());
		System.out.println();
		smartTV.turnOff();
		System.out.println();

		System.out.println("===================================================================================");

		System.out.println();
		TV androidTV = new androidTV("Sony TV", "LCD", 1920, 1080, "Full HD,2 HDMI Ports,20 watts output");
		androidTV.turnOn();
		System.out.println();
		System.out.println("Brand : " + androidTV.getBrand());
		System.out.println("Screen : " + androidTV.getScreenType());
		System.out.println("Screen Width: " + androidTV.getScreenWidth());
		System.out.println("Screen Height: " + androidTV.getScreenHeight());
		System.out.println("Features : " + androidTV.getTvFeatures());
		System.out.println();
		androidTV.turnOff();

	}

}
