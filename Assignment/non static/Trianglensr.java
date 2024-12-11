class Trianglensr
{
	double area(int b, int h)
	{
		double res = 0.5*b*h;
		return res;
	}
	public static void main (String [] args)
	{
		double x = new Trianglensr().area(10,12);
		System.out.println(x);
	}
}