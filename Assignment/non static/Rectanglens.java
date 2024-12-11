class Rectanglens
{
	void area(int l, int b)
	{
		double res = l*b;
		System.out.println(res);
	}
	public static void main(String [] args)
	{
		new Rectanglens().area(5 , 7);
	}
}