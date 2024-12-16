package lambdaexpressiondemo;
@FunctionalInterface
interface Drawable1
{
	public void draw();
}
public class WithLambdaExpressionDemo {

	public static void main(String[] args) {
		int width=10;
		Drawable1 d2=()->{
			System.out.println("Drawing " + width);
			};
		d2.draw();
	}
}
