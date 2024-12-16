package lambdaexpressiondemo;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {

	public static void main(String[] args) {
		//supplier :No input ,return a value
		Supplier<String> supplier= ()->"Hello from supplier";
		String suppliervalue=supplier.get();
		System.out.println(suppliervalue);

		//predicate :Takes one input ,return a boolean
		Predicate<Integer> isEven=number->number%2==0;
		int testNumber=10;
		if(isEven.test(testNumber))
		{
			System.out.println(testNumber+ " is even");
		}
		else
		{
			System.out.println(testNumber + " is odd");
		}
		
		//Consumer :Takes one input ,return nothing
		
		Consumer<String> consumer =message ->System.out.println("consumer received" +message);
		consumer.accept("This is a test message");
	}

}
