package arrays;

import java.util.Arrays;

public class ReferenceTypesVsValueTypes {

	public static void main(String[] args) {
		
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue : "+myIntValue);
		System.out.println("anotherIntvalue : "+anotherIntValue);
		
		anotherIntValue++;
		System.out.println();
		
		System.out.println("myIntValue : "+myIntValue);
		System.out.println("anotherIntvalue : "+anotherIntValue);
		
		System.out.println();
		
		int[] myIntArray = new int[5];
		int[] anotherIntArray = myIntArray;
		
		System.out.println("myIntArray = "+Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = "+Arrays.toString(anotherIntArray));
		
		anotherIntArray[0] = 1;
		
		System.out.println();
		System.out.println("After change myIntArray = "+Arrays.toString(myIntArray));
		System.out.println("After change anotherIntArray = "+Arrays.toString(anotherIntArray));
		
		System.out.println();
		
		//anotherIntArray = new int[] {12,13,14,15,16}; ---->dereferencing array
		modifyArray(myIntArray);
		
		System.out.println("After modify myIntArray = "+Arrays.toString(myIntArray));
		System.out.println("After modify anotherIntArray = "+Arrays.toString(anotherIntArray));


	}

	private static void modifyArray(int[] array) {
		
		array[0] = 3;        //myIntArray , anotherintArray , array point to same array in memmory 
		
		//Now array will not point to the array which is pointed by myIntArray and anotherIntArray
		array = new int[] {1,2,3,4,5};  //dereferencing an array
		
	}

}
