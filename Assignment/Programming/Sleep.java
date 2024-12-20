class Sleep
{
	public static boolean sleepin(boolean weekday,boolean vacation)
	{
		if (weekday == true && vacation == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main (String [] args)
	{
		boolean x = sleepin(true , true);
		System.out.println(x);
	}
}