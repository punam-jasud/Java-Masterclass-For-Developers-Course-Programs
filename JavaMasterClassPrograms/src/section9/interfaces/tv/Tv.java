package section9.interfaces.tv;

public interface Tv {
	
	public String getBrand();
	public void setBrand(String brand);

	public String getScreenType();

	public int getScreenWidth();

	public int getScreenHeight();

	public String getTvFeatures();

	public default void turnOn() {
		System.out.println("Turning on..."); // Default implementation
	}

	public default void turnOff() {
		System.out.println("Turning off..."); // Default implementation
	}

}
