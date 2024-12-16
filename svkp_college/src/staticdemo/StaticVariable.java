package staticdemo;

public class StaticVariable {

	String name;
	double price;
	public static String category="smart phone";
	
	public StaticVariable(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public void displayDetails()
	{
		System.out.println("Name " +name);
		System.out.println("Price "+price);
		System.out.println("category "+category);
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		StaticVariable mobile1=new StaticVariable("Redmi",15000);
		StaticVariable mobile2=new StaticVariable("Oppo",16000);

		System.out.println("Mobile 1 information");
		mobile1.displayDetails();
		System.out.println("Mobile 2 information");
		mobile2.displayDetails();
	}

}