class Ellipsensr
{
	double area(int a, int b)
	{
		final double pi = 3.14;
		double res = pi*a*b;
		return res;
	}
	public static void main ( String [] args)
	{
		double x = new Ellipsensr().area(5,6);
		System.out.println(x);
	}
}