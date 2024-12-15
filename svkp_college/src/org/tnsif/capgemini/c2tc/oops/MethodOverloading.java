package org.tnsif.capgemini.c2tc.oops;
class MethodOverloadingImp
{
	public int add(int a,int b) //2 para
	{
		return a+b;
	}
	public int add(int a, int b , int c) //3 para
	{
		return a+b+c;
	}
	public double add(int a, double b)
	{
		return a+b;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloadingImp obj= new MethodOverloadingImp();
		System.out.println(obj.add(4, 8));
		System.out.println(obj.add(2, 2.5));
		System.out.println(obj.add(4, 8,7));
		
		

	}

}
