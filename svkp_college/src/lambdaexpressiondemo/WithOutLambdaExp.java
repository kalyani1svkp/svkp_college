package lambdaexpressiondemo;
//demo on withoutlambdaexp
interface Drawable //functional interface
{
	public void draw(); 
}
class Test implements Drawable
{
	int width=10;
	@Override
	public void draw() {
		System.out.println("Drawing "+width);	
	}
}
public class WithOutLambdaExp {

	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}
}
