package collectionsdemo;



import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits =new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("cherry");
		fruits.add("Banana");
		
		System.out.println("All fruits : " +fruits);
		
		//access the element
		System.out.println("third fruit : " + fruits.get(2));
		
		//modify the element
		fruits.set(3, "grapes");
		
		System.out.println("After modification : " + fruits);
		
		//check if element exits
		
		if(fruits.contains("blue berry"))
		{
			System.out.println("Apple is in the list");
		}
		
		//check the size of the arraylist
		System.out.println("Size of the arraylist "+ fruits.size());
		
		//print all the element using a for-each loop
		
		for(  String fruit :fruits)
		{
			System.out.println(fruit);
		}
		
		//clear all the element
		
		fruits.clear();
		System.out.println("List cleared number of fruits "+ fruits.size());
	}

}


