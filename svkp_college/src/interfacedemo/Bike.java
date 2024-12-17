package interfacedemo;



//another class implementingn the same interface
public class Bike implements Vehicle
{
     private String type;
     
     public Bike(String type)
     {
    	 this.type=type;
     }
	@Override
	public void start() {
		
		System.out.println("Bike " + type + " is starting");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type+ " is stopping");
	}

}

