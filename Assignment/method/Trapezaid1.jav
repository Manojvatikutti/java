class Trapezaid1
{
	static void area(int a,int b,int height)
	{
		double result = (0.5*(a+b)*height) ;
		System.out.println("area of Trapezaid is "+result);
	}
	public static void main(String [] args)
	{
		area(10,12,12);
	}
}