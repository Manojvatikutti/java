class Circlens
{
	void area(int r)
	{
		final double pi = 3.14;
		double res = pi*r*r;
		System.out.println(res);
	}
	public static void main(String [] args)
	{
		new Circlens().area(5);
		new Circlens().area(8);
	}
}