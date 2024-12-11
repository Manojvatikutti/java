class Trapezaid
{
	static void area()
	{
		int a = 10;
		int b = 15;
		int height = 10;
		double result = (0.5*(a+b)*height) ;
		System.out.println("area of Trapezaid is "+result);
	}
}
class RunnerTrapezaid
{
	public static void main(String [] args)
	{
		Trapezaid.area();
	}
}