package section8.autoAndunboxing;

import java.util.ArrayList;

class IntClass {
	private int myInt;

	public IntClass(int myInt) {
		this.myInt = myInt;
	}
	
	public int getMyInt() {
		return myInt;
	}
	
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
}

public class AutoboxingUnboxingIntro {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Punam");
		
	//	ArrayList<int> intArraylist = new ArrayList<int>();  -->Cannot use primitive types
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		
//		Integer integer = new Integer(54);
//		Double double1 = new Double(54.54);
		
			ArrayList<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				integers.add(Integer.valueOf(i));  //Autoboxing - converting primitive type to object
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i+"------->"+integers.get(i).intValue());  //Unboxing - converting object  back  to primitive type
			}
			
			Integer myIntegerValue = 56; //Integer.ValueOf(56) - Behind Scenes 
			int Myint = myIntegerValue.intValue(); 

			ArrayList<Double> myDoubleValues = new ArrayList<Double>();
			for (Double i = 0.0; i < 10.0; i+=0.5) {
				myDoubleValues.add(Double.valueOf(i));
			}
			
			for (int i = 0; i < myDoubleValues.size(); i++) {
				System.out.println(i+"------->"+myDoubleValues.get(i).doubleValue());
			}
	}

}
