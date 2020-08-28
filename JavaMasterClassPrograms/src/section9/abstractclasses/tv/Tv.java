package section9.abstractclasses.tv;

public abstract class Tv {
	
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

	//Abstract methods - must be implemented in subclass
	public abstract void turnOn();

	public abstract void turnOff();

	
	//Non abstarct methods
	public String getBrand() {
		return brand;
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
	
	

}

class SmartTv extends Tv {

	public SmartTv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
		super(brand, screenType, screenWidth, screenHeight, tvFeatures);

	}

	@Override
	public void turnOn() {

		System.out.println("Please Wait Turning On " + this.getBrand() + " ..."); // Overridden abstract method
																					
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off " + this.getBrand() + " ..."); // Overridden abstract method
	}

}

class AndroidTv extends Tv {

	public AndroidTv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
		super(brand, screenType, screenWidth, screenHeight, tvFeatures);

	}

	@Override
	public void turnOn() {

		System.out.println("Please Wait Turning On " + this.getBrand() + " ..."); // Overridden abstract method
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off " + this.getBrand() + " ..."); //  Overridden abstract method
	}

}
