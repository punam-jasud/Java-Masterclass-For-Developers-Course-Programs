package section9.abstractclasses.tv;

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
