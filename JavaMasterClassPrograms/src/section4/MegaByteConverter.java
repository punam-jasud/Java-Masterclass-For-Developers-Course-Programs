package section4;

public class MegaByteConverter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);

	}
	public static void printMegaBytesAndKiloBytes(int KiloBytes) {
		
		if(KiloBytes < 0)
		{
			System.out.println("Invalid Value");
		}
		else 
		{
			int megaBytes = KiloBytes/1024;
			int remainingKiloBytes = KiloBytes % 1024;
			System.out.println(KiloBytes + " KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
			
		}
		
	}

}
