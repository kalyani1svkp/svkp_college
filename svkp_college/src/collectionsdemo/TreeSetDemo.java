package collectionsdemo;



import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>();
		set.add("cherry");
		set.add("banana");
		set.add("apple");
		
		set.add("cherry");
		
		System.out.println("Treeset " +set);
	}

}

