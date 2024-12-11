class Circlensr
{
	double area(int r)
	{
		final double pi = 3.14;
		double res = pi*r*r;
		return res;
	}
	public static void main (String [] args)
	{
		double x = new Circlensr().area(5);
		System.out.println(x);
	}
}