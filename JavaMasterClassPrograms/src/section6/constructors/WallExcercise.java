package section6.constructors;

public class WallExcercise {

	private double width;
	private double height;

	public WallExcercise() {
		System.out.println("Default Constructor");
	}

	public WallExcercise(double width, double height) {

		if (width < 0 && height < 0) {
			this.width = 0;
			this.height = 0;
		} else if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		} else if (width < 0) {
			this.width = 0;
			this.height = height;
		} else if (height < 0) {
			this.width = width;
			this.height = 0;
		} else {
			this.width = width;
			this.height = height;
		}

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0)
			this.width = 0;
		else {
			this.width = width;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0)
			this.height = 0;
		else {
			this.height = height;
		}
	}

	public double getArea() {
		return width * height;
	}

	public static void main(String[] args) {

		WallExcercise wall = new WallExcercise(-1.125, 1.0);
		System.out.println("Width : " + wall.getWidth());
		System.out.println("Height: " + wall.getHeight());
		System.out.println("Area = " + wall.getArea());

		System.out.println();

		wall.setHeight(-1.5);
		System.out.println("Width : " + wall.getWidth());
		System.out.println("Height: " + wall.getHeight());
		System.out.println("Area : " + wall.getArea());

	}

}
