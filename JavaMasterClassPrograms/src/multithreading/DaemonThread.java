package multithreading;

public class DaemonThread extends Thread{
	
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Its Daemon Thread");
		}
		else {
			System.out.println("Its User Thread");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
