class Sector1
{
	static void area(int radius, int degree)
	{
		double result = (0.5*radius*radius*degree) ;
		System.out.println("area of  Sector is "+result);
	}
}
class RunnerSector1
{
	public static void main(String [] args)
	{
		Sector1.area(5 , 30);
	}
}