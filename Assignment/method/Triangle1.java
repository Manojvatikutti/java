class Triangle1
{
	static void triangle(int base , int height)
	{
		double result = (0.5*base)*height ;
		System.out.println("Area of traingle is "+result);
	}
	public static void main (String [] args)
	{
		triangle(10,12);
	}
}