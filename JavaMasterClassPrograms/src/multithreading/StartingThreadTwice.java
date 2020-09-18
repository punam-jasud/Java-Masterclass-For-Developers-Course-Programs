package multithreading;

public class StartingThreadTwice extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running\n");
	}
	
	public static void main(String[] args) {
		
		StartingThreadTwice t1 = new StartingThreadTwice();
		t1.start();
		t1.start();
	}

}

//Thread will run once but for second time, it will throw an IllegalThreadStateException exception.