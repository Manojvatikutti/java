class Prg7
{
	static boolean posneg(int a,int b,boolean negative)
	{
		if( (a < 0 && b > 0)||(a > 0 && b < 0)||(negative == true && a < 0 && b < 0))
		{
			return true;
		}
		return false;
	}
	public static void main (String [] args)
	{
		System.out.println(posneg(1,-1, false));
		System.out.println(posneg(-1, 1 , false));
		System.out.println(posneg(-4, -5, true));
	}
}