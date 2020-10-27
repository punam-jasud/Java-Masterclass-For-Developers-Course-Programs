package appliances;

public interface IApplianceFunctions {

	void turnOn();

	void turnOff();

	// Default method is allowed since java 8
	default void clean() {
		System.out.println("Cleaning..");
	}

}
