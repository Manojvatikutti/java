class Primenumr
{
	static String prime(int num)
	{
		boolean flag = true;
		for (int i=2;i<=Math.sqrt(num) ;i++ )
		{
			if (num%i == 0)
			{
				flag = false;
				break;
			}
		}
		if (flag == true)
		{
			return(num+ "is a prime number");
		}
		else
		{
			return(num+ " is not a prime number");
		}
	}
	public static void main(String [] args)
	{
		String res = prime(200);
		System.out.println(res);
	}
}