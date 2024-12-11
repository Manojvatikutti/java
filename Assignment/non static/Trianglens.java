class Trianglens
{
	void area(int b,int h)
	{
		double res = 0.5*b*h;
		System.out.println(res);
	}
	public static void main(String [] args)
	{
		new Trianglens().area(5,6);
	}
}