package collectionsdemo;


import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("apple");
		System.out.println("Hashset :"+ set);
	}

}

