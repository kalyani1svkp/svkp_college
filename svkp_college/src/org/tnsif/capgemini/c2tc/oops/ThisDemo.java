package org.tnsif.capgemini.c2tc.oops;
class Product
{
	double price;
	
	Product(double price)
	{
		this.price=price;
	}
	double calucaluteDiscount()
	{
		return this.price*0.10;
	}
	double calculateFinalPrice()
	{
		return this.price-this.calucaluteDiscount();
	}
}


public class ThisDemo {

	public static void main(String[] args) {
		Product product=new Product(600);
		System.out.println("Final price " + product.calculateFinalPrice());
		

	}

}
