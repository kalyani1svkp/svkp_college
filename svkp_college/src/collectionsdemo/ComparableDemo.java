package collectionsdemo;


import java.util.ArrayList;
import java.util.Collections;

class Person5 implements Comparable<Person5>
{
	String name;
	int age;
	
	public Person5(String name, int age) {
		
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
	
	//sorting by age
	@Override
	public int compareTo(Person5 other) {
		return this.age-other.age;
	}

	
}
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person5> people=new ArrayList<>();
		people.add(new Person5("basker",12));
		people.add(new Person5("Anil",11));
		people.add(new Person5("Sushma",21));
		
		Collections.sort(people);
		
		for(Person5 person:people)
		{
			person.displayinfo();
		}
	}

}








