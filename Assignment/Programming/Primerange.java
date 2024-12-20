class Primerange
{
	public static void main(String [] args)
	{
		for (int j=2;j<=100 ;j++ )
		{
			int  num = j;
			boolean flag = true;
			for(int i=2 ; i<=Math.sqrt(num); i++)
			{
				if (num%i == 0)
				{
					flag = false;
					break;
				}
			}
		if (flag == true)
		{
			System.out.println(j+" is a prime number");
		}

		}
	}
}
	

