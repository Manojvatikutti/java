class Sector
{
	static void area()
	{
		int radius = 5;
		int degree = 30;
		double result = (0.5*radius*radius*degree) ;
		System.out.println("area of  Sector is "+result);
	}
	}
	class RunnerSector
	{
	public static void main(String [] args)
	{
		Sector.area();
	}
}