package generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(22.56);
		list.add(3);
		list.add(4);
		list.add(5.3);
		list.add('A');
		list.add(true);
		list.add("Punam");
		
		System.out.println(list);
		

	}


}
