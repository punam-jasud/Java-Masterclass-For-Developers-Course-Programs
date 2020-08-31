package appliances;

public class Soundbar extends EntertainmentAppliance {
	
	private String connectorType;
	private int numberOfSpeakers;
	
	public Soundbar(String name, String brand, String color, double weight, double price, String connectorType,
			int numberOfSpeakers) {
		super(name, brand, color, weight, price);
		
		this.connectorType = connectorType;
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getConnectorType() {
		return connectorType;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	@Override
	public void displayApplianceDetails() {
		super.displayApplianceDetails();
		System.out.println("Connector Type : "+this.getConnectorType());
		System.out.println("No of Speakers : "+this.getNumberOfSpeakers());
	}
		

}
