class Parrot
{
	public boolean parrotTrouble(boolean talking, int hour)
	{
		if (talking == true && (hour < 7 || hour > 20))
		{
			return true;
		}
		return false;
	}
	public static void main (String [] args)
	{
		Parrot p1 = new Parrot();
		System.out.println(p1.parrotTrouble(true , 6));
		System.out.println(p1.parrotTrouble(true , 7));
		System.out.println(p1.parrotTrouble(false , 6));
	}
}