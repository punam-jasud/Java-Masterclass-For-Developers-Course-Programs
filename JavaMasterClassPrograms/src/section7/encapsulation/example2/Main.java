package section7.encapsulation.example2;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(50, false);
		System.out.println("Initial Page Count = "+printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
		
		 pagesPrinted = printer.printPages(2);
			System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
	}

}
