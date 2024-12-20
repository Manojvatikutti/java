class Npri
{
	static String nxtprime(int n)
	{
		String res = null;
		for(int j=n+1;j<=100;j++)
		{
			int num = j;
			boolean flag = true;
			for (int i= 2; i<=Math.sqrt(num);i++ )
			{
				if (num%i == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				return (num+"is next prime number");
			
			}
		}
		return res;
	}
	public static void main(String [] args)
	{
		String x = nxtprime(95);
		System.out.println(x);
	}
}


