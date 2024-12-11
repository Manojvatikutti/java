class Ellipse
{
	static void area()
	{
		int a = 10;
		int b = 10;
		final double pi =3.14;
		double result = pi*a*b ;
		System.out.println("area of  Ellipse is "+result);
	}
	}
	class RunnerEllipse
	{
	public static void main(String [] args)
	{
		Ellipse.area();
	}
}