class Nextprime
{
	public static void main(String [] args)
	{
		int n = 20;
		for(int j=n+1;j<=100;j++)
		{
			int num = j;
			boolean flag = true;
			for (int i=2;i<=Math.sqrt(num) ;i++ )
			{
				if(num%i == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				System.out.println(num+" is the next prime number of "+n);
				break;
			}
		}
	}
}
			