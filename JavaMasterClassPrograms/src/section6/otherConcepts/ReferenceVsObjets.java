package section6.otherConcepts;

public class ReferenceVsObjets {

	public static void main(String[] args) {

		HouseClass blueHouseClass = new HouseClass("blue");
		HouseClass anotherHouseClass = blueHouseClass;

		System.out.println(blueHouseClass.getColorString()); // blue
		System.out.println(anotherHouseClass.getColorString()); // blue

		anotherHouseClass.setColorString("yellow");
		System.out.println(blueHouseClass.getColorString()); // yellow
		System.out.println(anotherHouseClass.getColorString()); // yellow

		HouseClass greenHouseClass = new HouseClass("green");
		anotherHouseClass = greenHouseClass;

		System.out.println(blueHouseClass.getColorString()); // yellow
		System.out.println(greenHouseClass.getColorString()); // green
		System.out.println(anotherHouseClass.getColorString()); // green
	}

}

class HouseClass {

	private String colorString;

	public HouseClass(String coloString) {
		this.colorString = coloString;
	}

	public String getColorString() {
		return colorString;
	}

	public void setColorString(String colorString) {
		this.colorString = colorString;
	}

}