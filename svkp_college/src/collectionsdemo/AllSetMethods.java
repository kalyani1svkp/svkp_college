package collectionsdemo;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllSetMethods {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		//add elements to the set
		
		set.add("Apple");
		set.add("Banana");
		set.add("cherry");
		set.add("Straw berry");
		set.add("Mango");
			
		//display the set
		
		System.out.println("initial set"+ set);

		//removing the element
		set.remove("Banana");
		System.out.println("Set after removing banana" + set );
		
		//checking if element present 
		
		    boolean  containscherry=set.contains("cherry");
		    System.out.println("Set contains cheery "+ containscherry);
		    
		 //get the size of the set
		 int size  = set.size();
		 System.out.println("size of set " + size);
		 
		 
		 //check if the set is empty
		 
		boolean isEmpty =set.isEmpty();
		System.out.println("Set is empty ?" + isEmpty);
		
		
		set.clear();
		System.out.println("after clear operation "+ set);
		
		set.add("Pine apple");
		set.add("Mango");
		
		//iterating over the elements of the set
		 System.out.println("iterating over the element");
	    Iterator<String> iterator =set.iterator();
	    while(iterator.hasNext())
	    {
	    	 System.out.println(iterator.next());
	    }
	   
	}

}


