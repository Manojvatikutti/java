class Pri
{
	static String pri(int num)
	{
		boolean flag = true;
		for(int i = 2;i<=Math.sqrt(num);i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		if (flag == true)
		{
			return (num+" is a prime");
		}
		else
		{
			return (num+" is not a prime");
		}
	}
	public static void main(String [] args)
	{
		String x = pri(10);
		System.out.println(x);
	}
}
