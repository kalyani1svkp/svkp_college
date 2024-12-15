package org.tnsif.capgemini.c2tc.oops;
class PaymentMethod
{
	void makePayment()
	{
		System.out.println("Processing payment");
	}
}
class CreditCard extends PaymentMethod
{
	void swipecard()
	{
		System.out.println("Swiping credit card");
	}
}

class Paypal extends PaymentMethod
{
	void loginPaypal()
	{
		System.out.println("Logging into paypal");
	}
}

public class Instanceof_Demo2 {

	public static void main(String[] args) {
		PaymentMethod payment=new PaymentMethod();
		payment=new Paypal(); //downcasting

		
		if (payment instanceof CreditCard)
		{
			CreditCard cc=(CreditCard)payment;
			cc.swipecard();
			}
		else
		{
			Paypal  pp=(Paypal) payment;
			pp.loginPaypal();
		}
	}

}
