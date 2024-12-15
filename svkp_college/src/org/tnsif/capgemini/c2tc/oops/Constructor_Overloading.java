package org.tnsif.capgemini.c2tc.oops;
class Book
{
	String title;
	int page;
	
	Book() ///constructor with no parameter
	{
		title="Unknow";
		page=0;
	}
	
	Book(String title)//constructor with one parameter
	{
		this.title=title;
		page=0;
	}
	Book(String title, int page)//constructor with two parameter
	{
		this.title=title;
		this.page=page;
	}
	void display()
	{
		System.out.println("Title :" +title +"Pages :" + page );
	}
	
	
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book("Java Programming");
		Book book3=new Book("Python Programming" ,500);
		
		book1.display();
		book2.display();
		book3.display();

	}

}
