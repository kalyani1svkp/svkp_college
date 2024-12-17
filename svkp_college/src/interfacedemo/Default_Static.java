package interfacedemo;


interface Vehicle1
{
	void start();
	void stop();
	
	int Max_speed=120;
	
	default void repair()
	{
	System.out.println("Vehicle is being repaired");	
	}
	static void CheckMaintence()
	{
		System.out.println("Vehicle is maintaince check complete");
		
	}
	
}

class Car5 implements Vehicle1
{
	private String model;
	
	Car5(String model)
	{
		this.model=model;
	}
	
	@Override
	public void start() {
		
		System.out.println("Car "+   model   + " is starting");
	}
	@Override
	public void stop() {
		System.out.println("Car "+   model   + " is Stopped");
		
	}

	static void Demo()
	{
		System.out.println("welcome");
		
	}
	
}
public class Default_Static {

	public static void main(String[] args) {
	
		Vehicle1 obj=new Car5("BMW");
		obj.start();
		obj.stop();
		
		System.out.println(" Max_speed of the vehicle" + Vehicle1.Max_speed);
		
		obj.repair();
		
		Vehicle1.CheckMaintence();//static method which is inside interface
		
		Car5.Demo();
		
	

}

}
