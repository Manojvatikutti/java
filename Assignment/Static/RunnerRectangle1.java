class Rectangle1
{
	static void area(int length,int breadth)
	{
		int result = length*breadth;
		System.out.println("area of rectangle is "+result);
	}
}
class RunnerRectangle1
{
	public static void main(String [] args)
	{
		Rectangle1.area(10,6);
	}
}