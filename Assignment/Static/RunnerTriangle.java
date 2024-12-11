class Triangle
{
	static void triangle()
	{
		int base = 10;
		int height = 13;
		double result = (0.5*base)*height ;
		System.out.println("Area of traingle is "+result);
	}
}
class RunnerTriangle
{
	public static void main (String [] args)
	{
		Triangle.triangle();
	}
}