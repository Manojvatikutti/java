class Teen2
{
	static boolean teen(int a,int b)
	{
		if (((a >= 13 && a<= 19) || (b >= 13 && b<= 19)) && !((a >= 13 && a<= 19) && (b >= 13 && b<= 19)))
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		System.out.println(teen(13,99));
		System.out.println(teen(21,19));
		System.out.println(teen(13,13));
	}
}