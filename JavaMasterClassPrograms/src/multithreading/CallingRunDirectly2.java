package multithreading;

public class CallingRunDirectly2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		CallingRunDirectly2 t1 = new CallingRunDirectly2();
		CallingRunDirectly2 t2 = new CallingRunDirectly2();
		
		t1.run();
		t2.run();
	}

}

//In the above program that there is no context-switching 
//because here t1 and t2 will be treated as normal object not thread object.