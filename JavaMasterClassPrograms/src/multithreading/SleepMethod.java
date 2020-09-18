package multithreading;

public class SleepMethod extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(getName()+ " : "+i);
		}
	}

	public static void main(String[] args) {
		
		SleepMethod t1 = new SleepMethod();
		SleepMethod t2 = new SleepMethod();
		
		t1.start();
		t2.start();

	}

}
