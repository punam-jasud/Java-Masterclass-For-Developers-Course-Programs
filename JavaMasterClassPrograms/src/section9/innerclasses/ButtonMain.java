package section9.innerclasses;

import java.util.Scanner;

public class ButtonMain {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	
	public static void main(String[] args) {
		
//		Local class
		class ClickListener implements Button.OnClickListener{
			public ClickListener() {
				System.out.println("I have been Attached");
			}

			@Override
			public void onClick(String titleString) {
				System.out.println(titleString + " was clicked");
			}
			
		}
		btnPrint.setOnClickListerner(new ClickListener());
		
//		Anonymous Class
//		btnPrint.setOnClickListerner(new Button.OnClickListener() {
//			
//			@Override
//			public void onClick(String titleString) {
//				System.out.println(titleString + " was clicked");
//			}
//		});
		listen();
	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice  = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;

			case 1:
				btnPrint.onClick();
				break;
			}
		}
	}

}