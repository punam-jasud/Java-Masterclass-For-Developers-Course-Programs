package multithreading;

public class CallingRunDirectly1 extends Thread{

	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		CallingRunDirectly1 t1 = new CallingRunDirectly1(); 
		
		t1.run();  ////fine, but does not start a separate call stack  
	}
}

//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
