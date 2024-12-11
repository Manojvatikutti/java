class Parallelogram1
{
	static void area( int length, int breadth)
	{
		int result = length*breadth;
		System.out.println("area of Parallelogram is "+result);
	}
}
class RunnerParallelogram1
{
	public static void main(String [] args)
	{
		Parallelogram1.area(12, 8);
	}
}