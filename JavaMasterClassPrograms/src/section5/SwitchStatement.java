package section5;

public class SwitchStatement {

	public static void main(String[] args) {

		char c = 'O';
		switch (c) {
		case 'a':
		case 'A':
			System.out.println("A or a Found");
			break;
		case 'e':
		case 'E':
			System.out.println("E or e Found");
			break;
		case 'i':
		case 'I':
			System.out.println("I or i Found");
			break;
		case 'o':
		case 'O':
			System.out.println("o or O Found");
			break;
		case 'u':
		case 'U':
			System.out.println("u or U Found");
			break;

		default:
			System.out.println("a,e,i,o,u not found");
			break;
		}

	}

}
