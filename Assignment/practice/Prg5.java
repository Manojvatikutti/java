class Prg5
{
	static boolean parrotTrouble(boolean talking , int hour)
	{
		if((hour < 7 || hour >20) && talking == true)
		{
			return true;
		}
		return false;
	}
	public static void main (String [] args)
	{
		System.out.println(parrotTrouble(true , 6));
		System.out.println(parrotTrouble(true , 7));
		System.out.println(parrotTrouble(false , 6));
	}
}