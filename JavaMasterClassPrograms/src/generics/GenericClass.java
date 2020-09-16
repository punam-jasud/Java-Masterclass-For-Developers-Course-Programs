package generics;

//Class without generic type

/*  public class GenericClass {
  
  private Object t;
  
  public Object getT() { return t; }
  
  public void setT(Object t) { this.t = t; }
  
   public static void main(String args[]){
		GenericClass obj = new GenericClass();
		obj.setT("Punam"); 
		String str = (String) obj.getT(); //type casting, error prone and can cause ClassCastException
	}
  
  }
 */

//Class with generic type
public class GenericClass<T> {

	// T stands for "Type"
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {

		GenericClass<String> instance = new GenericClass<String>();
		instance.setT("Punam"); // correct usage
		// instance.setT(123); //will raise compile time error
		System.out.println("Name : " + instance.getT());

		GenericClass<Integer> obj = new GenericClass<Integer>();
		// obj.setT("Punam"); //will raise compile time error
		obj.setT(24); // correct usage
		System.out.println("Age : " + obj.getT());

	}

}