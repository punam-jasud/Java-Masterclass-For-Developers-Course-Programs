package section9.interfaces.tv;

public class AndroidTv extends TvImplementation {

	private boolean internetConncetion;

	public AndroidTv(String brand, String screenType, int screenWidth, int screenHeight, String tvFeatures,boolean internetConncetion) {
		super(brand, screenType, screenWidth, screenHeight, tvFeatures);
		
		this.internetConncetion = internetConncetion;
	}

	private boolean isInternetConncetion() {
		return internetConncetion;
	}
	public void checkConnection() {
		if (isInternetConncetion()) {
			System.out.println("Internet Connection : Yes");
		}
		else {
			System.out.println("Internet Connection : No");
		}
	}
}
