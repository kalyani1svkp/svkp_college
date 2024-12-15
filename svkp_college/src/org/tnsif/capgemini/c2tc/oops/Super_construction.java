package org.tnsif.capgemini.c2tc.oops;
class Animal7
{
	Animal7()
	{
		System.out.println("Animal Constructor");
	}
}
class Dog7 extends Animal7
{
	Dog7()
	{
		super();
		System.out.println("Dog Constructor");
		
	}
}

public class Super_construction {

	public static void main(String[] args) {
		Dog7 dog=new Dog7();

	}

}
