class Ellipse1
{
	static void area(int a, int b)
	{
		final double pi =3.14;
		double result = pi*a*b ;
		System.out.println("area of  Ellipse is "+result);
	}
}
class RunnerEllipse1
{
	public static void main(String [] args)
	{
		Ellipse1.area( 10, 12);
	}
}