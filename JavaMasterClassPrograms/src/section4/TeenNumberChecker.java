package section4;

public class TeenNumberChecker {

	public static void main(String[] args) {
		
	System.out.println(hasTeen(9, 99, 19));

	}
	
	public static boolean hasTeen(int first , int second,int third) {
		
		if((first >= 13 && first <=19) ||(second >= 13 && second <=19) || (third >= 13 && third <=19))
			return true;
		
		return false;
	}

	public static boolean isTeen(int num) {
		
		if((num >= 13 && num <=19))
			return true;
		
		return false;
	}

}
