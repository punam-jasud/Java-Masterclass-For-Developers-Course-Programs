package section7.polymorphism.example3;

class Tv {

	private String brand;
	private String screenType;
	private int screenWidth;
	private int screenHeight;
	private String tvFeatures;

	public Tv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {

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

class SmartTv extends Tv {

	public SmartTv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
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

class AndroidTv extends Tv {

	public AndroidTv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
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

		Tv smartTv = new SmartTv("Mi TV", "LED", 900, 600, "quad-core,cortex A53 processor,Mail-450 Processor");
		smartTv.turnOn();
		System.out.println();
		System.out.println("Brand : " + smartTv.getBrand());
		System.out.println("Screen : " + smartTv.getScreenType());
		System.out.println("Screen Width: " + smartTv.getScreenWidth());
		System.out.println("Screen Height: " + smartTv.getScreenHeight());
		System.out.println("Features : " + smartTv.getTvFeatures());
		System.out.println();
		smartTv.turnOff();
		System.out.println();

		System.out.println("===================================================================================");

		System.out.println();
		Tv androidTv = new AndroidTv("Sony TV", "LCD", 1920, 1080, "Full HD,2 HDMI Ports,20 watts output");
		androidTv.turnOn();
		System.out.println();
		System.out.println("Brand : " + androidTv.getBrand());
		System.out.println("Screen : " + androidTv.getScreenType());
		System.out.println("Screen Width: " + androidTv.getScreenWidth());
		System.out.println("Screen Height: " + androidTv.getScreenHeight());
		System.out.println("Features : " + androidTv.getTvFeatures());
		System.out.println();
		androidTv.turnOff();

	}

}