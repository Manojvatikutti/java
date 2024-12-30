class Prg1
{
	static boolean sleepin(boolean weekday,boolean vacation)
	{
		if(!weekday == true || vacation == true)
		{
			return true;
		}	
		return false;
	}
	public static void main (String [] args)
	{
		System.out.println(sleepin(false , false));
		System.out.println(sleepin(true , false));
		System.out.println(sleepin(false , true));
	}
}