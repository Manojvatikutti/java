class Square1
{
static void square(int length)
	{
	int result = length*length;
	System.out.println("Area of square is "+result);
	}
}
class RunnerSquare1
{
	public static void main(String [] args)
	{
		Square1.square(8);
	}
}