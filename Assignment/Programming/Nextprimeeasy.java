class Nextprimeeasy
{
	static int nextprime(int n)
	{	
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
				return flag;			
			}
	    }
		return n;
	}
	public static void main(String [] args)
	{
		
		int res = nextprime(7);
		
		System.out.println(res+" is the next prime number");
		
	}
}
			