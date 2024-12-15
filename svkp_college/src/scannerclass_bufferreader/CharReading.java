package scannerclass_bufferreader;
import java.util.Scanner;
public class CharReading {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		char c=scan.next().charAt(3);
		System.out.println("the fourth character of the input string " + c);

	}

}
