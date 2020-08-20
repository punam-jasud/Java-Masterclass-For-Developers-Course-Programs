package section6.classes;

public class PointExcercise {

	private int x;
	private int y;

	public PointExcercise() {

	}

	public PointExcercise(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {

		return Math.sqrt(x * x + y * y);
	}

	public double distance(int x, int y) {

		int xX = Math.abs(this.x - x);
		int yY = Math.abs(this.y - y);

		return Math.sqrt(xX * xX + yY * yY);

	}

	public double distance(PointExcercise anyWord) {

		return distance(anyWord.getX(), anyWord.getY());
	}

	public static void main(String[] args) {

		PointExcercise first = new PointExcercise(6, 5);
		PointExcercise second = new PointExcercise(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second) = " + first.distance(second));
		System.out.println("distance(2,2) = " + first.distance(2, 2));
		PointExcercise point = new PointExcercise();
		System.out.println("distance() = " + point.distance());

	}
}
