package interfacedemo;



interface Vehicle3
{
	void start();
	void stop();
}
interface ElectricalVehicle extends Vehicle3
{
	void ChargeBattery();
}

class Tesla implements ElectricalVehicle
{

	@Override
	public void start() {
		System.out.println("Tesla is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopped");
		
	}

	@Override
	public void ChargeBattery() {
		System.out.println("Charging battery");
		
	}
	
}

public class Interface_Imp_Interface {

	public static void main(String[] args) {
		Tesla obj=new Tesla();
		obj.start();
		obj.stop();
		obj.ChargeBattery();

	}

}


