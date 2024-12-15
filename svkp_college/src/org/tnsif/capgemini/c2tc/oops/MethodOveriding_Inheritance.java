package org.tnsif.capgemini.c2tc.oops;
class Animal4
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog4 extends Animal4

{
	void makeSound()
	{
		System.out.println("Dog is eating");
	}
}

class Cat4 extends Animal4
{
	void makeSound()
	{
		System.out.println("Cat is eating");
	}
}


public class MethodOveriding_Inheritance {

	public static void main(String[] args) {
		Animal4 obj=new Animal4();
		Dog4 obj1=new Dog4();
		Cat4 obj2=new Cat4();
		
		obj.makeSound();
		obj1.makeSound();
		obj2.makeSound();
		
	}

}
