package collectionsdemo;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add(null);
		System.out.println("LinkedhashSet "+set);
	}

}

