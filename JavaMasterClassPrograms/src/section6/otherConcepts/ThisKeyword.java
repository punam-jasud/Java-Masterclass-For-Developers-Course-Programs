package section6.otherConcepts;

public class ThisKeyword {

	public static void main(String[] args) {
		House house = new House("Green");
		System.out.println(house.getColor());

		house.setColor("Red");
		System.out.println(house.getColor());
	}

}

class House {
	private String color;

	public House(String color) {
		// this keyword is required , same parameter name as field
		this.color = color;
	}

	public String getColor() {
		// this is optional
		return color; // same as return this.color
	}

	public void setColor(String color) {
		// this keyword is required , same parameter name as field
		this.color = color;
	}

}
