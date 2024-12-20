class Icyhot
{
	static boolean icyhot(int temp1, int temp2)
	{
		if( (temp1 <0 && temp2>100)||(temp2 <0 && temp1>100))
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		System.out.println(icyhot(120,-1));
		System.out.println(icyhot(-1,120));
		System.out.println(icyhot(2,120));
	}
}