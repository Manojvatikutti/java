class Parallelogram
{
	static void area()
	{
		int length = 12;
		int breadth = 8;
		int result = length*breadth;
		System.out.println("area of Parallelogram is "+result);
	}
}
class RunnerParallelogram
{
	public static void main(String [] args)
	{
		Parallelogram.area();
	}
}