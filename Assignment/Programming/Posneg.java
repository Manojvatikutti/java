class Posneg
{
	static boolean posneg(int a,int b,boolean negetive)
	{
		if ((a < 0 && b > 0) || (a > 0 && b < 0) || (negetive == true) && (a < 0 && b < 0))
		{
			return true;
		}
		return false;
	}
	public static void main (String [] args)
	{
		System.out.println(posneg(1,-1,false));
		System.out.println(posneg(-1,1,false));
		System.out.println(posneg(-4,-5,true));
		System.out.println(posneg(4,5,true));
	}
}