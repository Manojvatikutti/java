class Rectanglensr
{
	int area(int l, int b)
	{
		int res = l * b;
		return res;
	}
	public static void main (String [] args)
	{
		int x = new Rectanglensr().area(3,4);
		System.out.println(x);
	}
}