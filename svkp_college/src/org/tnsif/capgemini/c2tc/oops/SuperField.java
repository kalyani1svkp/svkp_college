package org.tnsif.capgemini.c2tc.oops;
class Animal6
{
	String name="Animal";
}

class Dog6 extends Animal6
{
	String name="Dog";
	
	void display()
	{
		System.out.println("Superclass name : "+ super.name);
		System.out.println("subclass name :  "+ name);
	}
}


public class SuperField {

	public static void main(String[] args) {
		
		Dog6 dog=new Dog6();
		dog.display();
	}

}
