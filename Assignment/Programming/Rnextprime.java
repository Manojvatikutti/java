class Rnextprime
{
	static boolean isPrime(int num )
	{
		for(int i = 2;i<Math.sqrt(num) ; i++)
		{
			if (num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	static int nextPrime(int n)
	{
		int num = n+1;
		while(!isPrime(num))
		{
			num++;
		}
		return num;
	}
	public static void main(String [] args)
	{
		int n = 19;
		int nextprimenumber = nextPrime(n);
		System.out.println("the next prime number of "+ n + " is "+nextprimenumber);
	}
}
		