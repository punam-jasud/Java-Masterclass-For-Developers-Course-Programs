package multithreading;

public class ImplementingRunnableInterface implements Runnable{

	@Override
	public void run() {
	
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ImplementingRunnableInterface t = new ImplementingRunnableInterface();
		Thread thread = new Thread(t);
		
		thread.start();
	}
}
