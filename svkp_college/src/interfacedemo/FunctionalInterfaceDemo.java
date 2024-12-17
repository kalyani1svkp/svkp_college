package interfacedemo;


class GreetingImp implements FunctionalInterface1
{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunctionalInterface1 obj=new GreetingImp();
		obj.sayHello("Leela");

	}


}
