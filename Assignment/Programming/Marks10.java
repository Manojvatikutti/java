class Marks10
{
	static boolean makes10(int a, int b)
	{
		int sum = a+b;
		if( a == 10 || b == 10|| sum == 10)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		System.out.println(makes10(9,10));
		System.out.println(makes10(9,9));
		System.out.println(makes10(1,9));
	}
}