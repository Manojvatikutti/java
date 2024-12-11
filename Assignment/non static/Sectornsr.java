class Sectornsr
{
	double area(int r, int deg)
	{
		double res = 0.5*r*r*deg;
		return res;
	}
	public static void main (String [] args)
	{
		double x = new Sectornsr().area(5, 30);
		System.out.println(x);
	}
}