package staticdemo;



	class MathUtils
	{
		public static int square(int number)
		{
			return number * number;
		}
		public static int add(int a,int b)
		{
			return a+b;
		}
	}

	public class StaticMethod {

		public static void main(String[] args) {
			int result1=MathUtils.square(5);
			 int result2=MathUtils.add(2,1);
			 System.out.println("square of 5: " + result1);
			 System.out.println("add of number: " + result2);
		}

	}
