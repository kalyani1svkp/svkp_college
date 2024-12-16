package exception;
import java.io.IOException;

public class ThrowsDemo {

	//sree lakshmi
	void m1()
	{
		System.out.println("No exception in this method");
	}
	//mounika
	void m2() throws IOException
	{
		throw new IOException("Device error/ file not found");
	}
	
	//venkanna
	void m3() throws ArithmeticException,IOException,ClassNotFoundException
	{
		throw new IOException("file not found");
	}
	
	public static void main(String[] args) {
		ThrowsDemo obj=new ThrowsDemo();
		obj.m1();
		try
		{
			obj.m2();
	
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			obj.m3();		
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException" +e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IOException " +e.getMessage());
		}
		catch(ClassNotFoundException e)
	  {
		System.out.println("ClassNotFoundException "+e.getMessage());	

	}

}
}
