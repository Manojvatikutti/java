class Sectorns
{
	void area(int r, int deg)
	{
		double res = 0.5*r*r*deg;
		System.out.println(res);
	}
	public static void main (String [] args)
	{
		new Sectorns().area(5,30);
	}
}