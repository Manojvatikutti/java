class Square
{
static void square()
	{
	int length = 8;
	int result = length*length;
	System.out.println("Area of square is "+result);
	}
}
class RunnerSquare
{
	public static void main(String [] args)
	{
		Square.square();
	}
}