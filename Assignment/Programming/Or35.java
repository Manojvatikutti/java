class Or35
{
	static boolean or35(int n)
	{
		if ( n%3 == 0 || n%5 == 0)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		System.out.println(or35(3));
		System.out.println(or35(10));
		System.out.println(or35(8));
	}
}