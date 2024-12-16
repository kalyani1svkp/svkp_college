package exception;

public class NullPointerException1 {

	public static void main(String[] args) {
		String str=null;
		
		try
		{
			System.out.println(str.length());
		}catch(NullPointerException e)
		{
		System.out.println(e);
		}
		System.out.println("welcome");

	}

}
