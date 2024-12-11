class Trapezaidnsr
{
	double area(int a,int b,int h)
	{
		double res = 0.5*(a+b)*h;
		return res;
	}
	public static void main(String [] args)
	{
		double x = new Trapezaidnsr().area(5,6,8);
		System.out.println(x);
	}
}