class Parallelogramnsr
{
	int area( int l, int b)
	{
		int res = l*b;
		return res;
	}
	public static void main( String [] args)
	{
		int x = new Parallelogramnsr().area(5,6);
		System.out.println(x);
	}
}