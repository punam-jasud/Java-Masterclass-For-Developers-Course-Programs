package section4;

public class PlayingCat {

	public static void main(String[] args) {

		System.out.println(iscatPlaying(false, 35));
	}

	public static boolean iscatPlaying(boolean summer, int temperature) {
		if (!summer && (temperature >= 25 && temperature <= 35))
			return true;
		if (summer && (temperature >= 25 && temperature <= 45))
			return true;

		return false;

	}
}
