package section7.composition.example1;

public class Motherboard {

	private String modelString;
	private String manufactureString;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	
	public Motherboard(String modelString, String manufactureString, int ramSlots, int cardSlots, String bios) {
		super();
		this.modelString = modelString;
		this.manufactureString = manufactureString;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public void loadProgram(String programName)
	{
		System.out.println("Program "+programName+" is now loading...");
	}
	
	public String getModelString() {
		return modelString;
	}


	public String getManufactureString() {
		return manufactureString;
	}


	public int getRamSlots() {
		return ramSlots;
	}


	public int getCardSlots() {
		return cardSlots;
	}


	public String getBios() {
		return bios;
	}
	
	
	
}
