class Ellipsens
{
	void area(int a,int b)
	{
		final double pi = 3.14;
		double res = pi*a*b;
		System.out.println(res);
	}
	public static void main( String [] args)
	{
		new Ellipsens().area(10,12);
	}
}