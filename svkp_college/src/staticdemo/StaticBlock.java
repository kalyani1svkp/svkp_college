package staticdemo;

public class StaticBlock {

	public void display()
	{
		System.out.println("instance block -1");
	}
	static
	{
		System.out.println("static block -1");
	}
	
	static
	{
		System.out.println("static block -2");
	}
	
	
	public static void main(String[] args) {
		StaticBlock obj=new StaticBlock ();
		obj.display();

	}

}
