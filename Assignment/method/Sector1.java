class Sector1
{
	static void area(int radius, int degree)
	{
		double result = (0.5*radius*radius*degree) ;
		System.out.println("area of  Sector is "+result);
	}
	public static void main(String [] args)
	{
		area(5 , 30);
	}
}