package scannerclass_bufferreader;
import java.util.Scanner;
public class AdvancedScannerClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some data(you can enter number or text");
		while(scan.hasNext())
		if(scan.hasNextInt())
			{
				int intvalue=scan.nextInt();
				System.out.println("read an integer "+ intvalue);
			}
		else if (scan.hasNextDouble())
		{
			double doublevalue=scan.nextDouble();
			System.out.println("read an double "+doublevalue);
		}
		else
		{
			String stringvalue=scan.next();
			System.out.println("unknow input " +stringvalue);
		}

	}

}
