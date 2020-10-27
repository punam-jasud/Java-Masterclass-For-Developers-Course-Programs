package appliances;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntertainmentAppliance entertainmentAppliance;
		CleaningAppliance cleaningAppliance;
		KitchenAppliance kitchenAppliance;

		int choice;

		while (true) {
			System.out.print("\n***************************************************************************");
			System.out.print("\nChoose Appliance :\n\n" + "1.Tv\n2.Soundbar\n" + "3.Washing Machine\n4.Dish Washer\n"
					+ "5.Oven\n6.Microwave\n7.Exit\n\n" + "Choice : ");

			choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				entertainmentAppliance = new Tv("Tv", "Mi TV", "Black", 10, 50000, "LCD", 900, 600,
						"quad-core,cortex A53 processor,Mail-450 Processor");
				entertainmentAppliance.turnOn();
				System.out.println();
				entertainmentAppliance.displayApplianceDetails();
				System.out.println();
				entertainmentAppliance.turnOff();
				entertainmentAppliance.clean();
				break;

			case 2:
				entertainmentAppliance = new Soundbar("Soundbar", "Mi", "Black", 3, 15000, "Bluetooth", 6);
				entertainmentAppliance.turnOn();
				System.out.println();
				entertainmentAppliance.displayApplianceDetails();
				System.out.println();
				entertainmentAppliance.turnOff();
				entertainmentAppliance.clean();
				break;
			case 3:
				cleaningAppliance = new WashingMachine("Washing Machine", "Samsung", "White", 30, 25000, false, "Steel",
						9, 220);
				cleaningAppliance.turnOn();
				System.out.println();
				cleaningAppliance.displayApplianceDetails();
				System.out.println();
				cleaningAppliance.wash();
				cleaningAppliance.turnOff();
				cleaningAppliance.clean();
				break;
			case 4:
				cleaningAppliance = new DishWasher("Dish Washer", "oneAssit", "Silver", 15, 8000, true, "Synthetic");
				cleaningAppliance.turnOn();
				System.out.println();
				cleaningAppliance.displayApplianceDetails();
				System.out.println();
				cleaningAppliance.wash();
				cleaningAppliance.turnOff();
				cleaningAppliance.clean();
				break;
			case 5:
				kitchenAppliance = new Oven("Oven", "Samsung", "Black", 10, 5000);
				kitchenAppliance.turnOn();
				System.out.println();
				kitchenAppliance.displayApplianceDetails();
				System.out.println();
				kitchenAppliance.cook();
				kitchenAppliance.turnOff();
				kitchenAppliance.clean();
				break;
			case 6:
				kitchenAppliance = new Microwave("Microwave", "oneAssit", "Black", 10, 7000);
				kitchenAppliance.turnOn();
				System.out.println();
				kitchenAppliance.displayApplianceDetails();
				System.out.println();
				kitchenAppliance.cook();
				kitchenAppliance.turnOff();
				kitchenAppliance.clean();
				break;
			case 7:
				System.exit(1);
			default:
				System.out.println("Wrong Choice");
				break;

			}
		}
	}

}
