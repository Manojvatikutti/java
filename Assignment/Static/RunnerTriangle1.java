class Triangle1
{
	static void triangle(int base , int height)
	{
		double result = (0.5*base)*height ;
		System.out.println("Area of traingle is "+result);
	}
}
class RunnerTriangle1
{
	public static void main (String [] args)
	{
		Triangle1.triangle(10,12);
	}
}