class Squarensr
{
	int area(int s)
	{
		int res = s*s;
		return res;
	}
	public static void main (String [] args)
	{
		int x = new Squarensr().area(5);
		System.out.println(x);
	}
}