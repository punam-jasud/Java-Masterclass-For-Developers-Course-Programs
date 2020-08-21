package section7.encapsulation.example1;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player("punam", 200, "Sword");
		System.out.println("Initial Health is  "+player.getHealth());

	}

}
