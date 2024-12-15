package scannerclass_bufferreader;

import java.util.Scanner;
public class ScannerAllMethod{

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		 System.out.println("Enter your age");
		 int age=scan.nextInt();
		 
		 System.out.println("Enter your Height");
		 float Height=scan.nextFloat();
		 
		 System.out.println("Are you a student");
		 boolean isstudent=scan.nextBoolean();
		 
		 System.out.println("Enter your aadhar number");
		 Long aadhar = scan.nextLong();
		 scan.nextLine();// 909998989981
		 
		 System.out.println("Enter your favorite teacher");
		String teacher= scan.nextLine();
		
		System.out.println("Enter your hobby");
		String hobby=scan.nextLine();
		
		System.out.println("Enter your CGPA");
		double cgpa=scan.nextDouble();
		
		System.out.println("Enter your daily reading time in minutes");
		byte readingtime=scan.nextByte();
		
		System.out.println("Enter no of siblings you have");
		short siblings=scan.nextShort();
		
		System.out.println("Student information");
		System.out.println("name " +name);
		System.out.println("age "+ age);
		System.out.println("Height " + Height);
		System.out.println("isstudent "+isstudent);
		System.out.println("aadhar "+ aadhar);
		System.out.println("fav teacher "+teacher );
		System.out.println("hobby "+ hobby);
		System.out.println("cgpa "+ cgpa);
		System.out.println("readingtime" +readingtime +"min");
		System.out.println("siblings "+ siblings) ;
		

	}

}

