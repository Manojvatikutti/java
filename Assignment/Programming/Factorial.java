class Factorial
{
	static int factorial(int num)
	{
		int fact = 1;
		for(int i=num; i>=1;i--)
		{
		  fact = fact * i;
		}
		  return fact;
	}
	public static void main(String [] args)
	{
		int x = factorial(5);
				System.out.println("factorial of number is "+x);
	}
}