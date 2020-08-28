package section9.interfaces.tv;

public class TvImplementation implements Tv{

	private String brand;
	private String screenType;
	private int screenWidth;
	private int screenHeight;
	private String tvFeatures;
	
	
	
	public TvImplementation(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures) {
		
		this.brand = brand;
		this.screenType = screenType;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.tvFeatures = tvFeatures;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public void setBrand(String brand) {
		this.brand = brand;
		
	}

	@Override
	public String getScreenType() {
		return screenType;
	}

	@Override
	public int getScreenWidth() {
		return screenWidth;
	}

	@Override
	public int getScreenHeight() {
		return screenHeight;
	}

	@Override
	public String getTvFeatures() {
		return tvFeatures;
	}

	@Override
	public void turnOn() {
		System.out.println("Please Wait Turning On " + this.getBrand() + " ...");
	}

	@Override
	public void turnOff() {
		System.out.println("Please Wait Turning Off " + this.getBrand() + " ...");
	}

}
