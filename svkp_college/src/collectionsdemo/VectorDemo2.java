package collectionsdemo;




import java.util.List;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) throws InterruptedException {
	   List<Integer> numbers=new Vector<>();
	   
	   //Thread 1 : adds elements to the vector
	   Thread thread1=new Thread( ()->{
	   for(int i=1;i<5;i++)
	   {
		   numbers.add(i); //1 2 3 4 
		   System.out.println("Thread 1 added " + i);
	   }
	   });   
	   
	   //Thread 2:remove elements from the vector
	   Thread thread2=new Thread( ()->{
	   for(int i=1;i<5;i++)
	   {
		  if(!numbers.isEmpty())
		  {
			  System.out.println("Thread 2 removed " + numbers.remove(0));
		  }
	   }
	});

	   
	   thread1.start();
	   thread2.start();
	   
	   thread1.join();
	   thread2.join();
	   
	   System.out.println("Numbers left in the vector "+ numbers);
}
}

