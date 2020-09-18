package multithreading;

public class getNameAndSetName extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" is running");
	}
	public static void main(String[] args) {
		getNameAndSetName t1 = new getNameAndSetName();
		getNameAndSetName t2 = new getNameAndSetName();
		
		System.out.println("Name of t1 : "+t1.getName());
		System.out.println("Name of t2 : "+t2.getName());
		System.out.println("ID of t1 : "+t1.getId());
		System.out.println("ID of t2 : "+t2.getId());
		
		
		t1.start();
		t2.start();
		
		t1.setName("My First Thread");
		System.out.println("After Changing Name of t1 : "+t1.getName());
		
		
	}
}
