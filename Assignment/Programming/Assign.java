class Assign
{
	public static boolean sleepin(boolean weekday,boolean vacation)
	{
		if ( weekday == true  || vacation == true);
			return true;
		else if(weekday == true || vacation == false)
			return false;
		else
			return true;
	}
	public static void main (String [] args)
	{
		boolean x = sleepin(false, false);
		boolean y = sleepin(true, false);
		boolean z = sleepin(false, true);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}