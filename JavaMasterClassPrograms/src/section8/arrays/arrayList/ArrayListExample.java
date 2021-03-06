package section8.arrays.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
	

    private static ArrayList<String> groceryList = new ArrayList<String>();
    
    public static void main(String args[]) {
    	addGroceryItem("Bread");
    	addGroceryItem("Pasta ");
    	addGroceryItem("Rice");     //----------->Add Item
    	addGroceryItem("Cheese");
    	addGroceryItem("Soups ");
    	printGroceryList();
    	System.out.println();
    	modifyGroceryItem(2, "Meat");   //---------->Modify Item
    	System.out.println();
    	printGroceryList();
    	System.out.println();
    	removeGroceryItem(3);            //-------------->Remove Item
    	printGroceryList();
    	System.out.println();
    	System.out.println("Item Found in List is = "+findItem("Meat"));  //------>Search for an item
    	
    	
    }

    public static void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public static void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public static void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public static void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public static String findItem(String searchItem) {
    	//boolean exists = groceryList.contains(searchItem);
    	
    	int position = groceryList.indexOf(searchItem);
    	if (position >= 0) {
			return groceryList.get(position);
		}
    	return null;
    }
}
