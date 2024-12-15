package org.tnsif.capgemini.c2tc.oops;
class Person
{
	
}

class Employee extends Person
{
	
}

class Manager extends Employee
{
	
}


public class Instanceof_Demo1 {

	public static void main(String[] args) {
		Person person =new Person();
		Employee employee=new Employee();
		Manager manager=new Manager();
		System.out.println(employee instanceof Employee );
		System.out.println(employee instanceof Person);
		System.out.println(employee instanceof Manager);
		System.out.println(manager instanceof Manager);
		System.out.println(manager instanceof Employee);
		System.out.println(manager instanceof Person);
		System.out.println(person instanceof Employee);
		System.out.println(person instanceof Manager);
	}

}
