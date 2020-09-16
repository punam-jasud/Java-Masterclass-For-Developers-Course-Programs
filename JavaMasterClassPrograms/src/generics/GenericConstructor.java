package generics;

public class GenericConstructor<T> {
	
	private T t1;
	private T t2;
	
	
	//Generic constructor
	public GenericConstructor(T t1, T t2) {
		
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T getT1() {
		return t1;
	}

	public T getT2() {
		return t2;
	}

	public static void main(String[] args) {
		
		GenericConstructor< String > obj1 = new GenericConstructor<String>("Punam", "Jasud");
		
		System.out.println("Name : "+obj1.getT1()+" "+obj1.getT2());
		
		
		
		GenericConstructor< Integer > obj2 = new GenericConstructor<Integer>(2,20);
		
		System.out.println("Age : "+ (obj2.getT1()+obj2.getT2()));
		
		
		
	}
	
}
