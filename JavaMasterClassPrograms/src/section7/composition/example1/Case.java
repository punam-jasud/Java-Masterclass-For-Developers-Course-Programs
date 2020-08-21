package section7.composition.example1;

public class Case {
	
	private String modelString;
	private String manufacturerString;
	private String powerSupplyString;
	private Dimensions dimensions;
	
	
	public Case(String modelString, String manufacturerString, String powerSupplyString, Dimensions dimensions) {
		super();
		this.modelString = modelString;
		this.manufacturerString = manufacturerString;
		this.powerSupplyString = powerSupplyString;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton()
	{
		System.out.println("Power button pressed");
	}

	public String getModelString() {
		return modelString;
	}

	public String getManufacturerString() {
		return manufacturerString;
	}

	public String getPowerSupplyString() {
		return powerSupplyString;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	
}
