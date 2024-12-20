class Monkey
{
	static boolean monkeyTrouble(boolean asmile , boolean bsmile)
	{
		if  ((asmile && bsmile) || ( !asmile && !bsmile))
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		System.out.println(monkeyTrouble(true,true));
		System.out.println(monkeyTrouble(false,false));
		System.out.println(monkeyTrouble(true,false));
	}
}