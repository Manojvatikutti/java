class Sumdouble
{
	static int sumdouble(int a, int b)
	{
		if (a == b)
		{
			return (a+b)*2;
		}
		return (a+b);
	}
	public static void main (String [] args)
	{
		System.out.println(sumdouble(1,2));
		System.out.println(sumdouble(3,2));
		System.out.println(sumdouble(2,2));
	}
}