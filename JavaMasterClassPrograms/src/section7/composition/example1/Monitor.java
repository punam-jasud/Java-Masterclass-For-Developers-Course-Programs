package section7.composition.example1;



public class Monitor {
	
	private String modeString;
	private String manufacturerString;
	private int size;
	private Resolution nativeResolution;
	
	
	public Monitor(String modeString, String manufacturerString, int size, Resolution nativeResolution) {
		super();
		this.modeString = modeString;
		this.manufacturerString = manufacturerString;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x,int y,String color)
	{
		System.out.println("Drawing pixel at "+x+" , "+y+" in color "+color);
	}

	public String getModeString() {
		return modeString;
	}

	public String getManufacturerString() {
		return manufacturerString;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	
}
