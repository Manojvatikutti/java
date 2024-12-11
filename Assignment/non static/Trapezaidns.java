class Trapezaidns
{
	void area(int a,int b,int h)
	{
		double res = 0.5*(a+b)*h;
		System.out.println(res);
	}
	public static void main(String [] args)
	{
		new Trapezaidns().area(4,5,6);
	}
}