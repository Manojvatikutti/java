class Area
{
	void circle()
	{
		int r = 5;
		final double pi = 3.14;
		double res = pi*r*r;
		System.out.println(res);
	}
	void triangle()
	{
		int b = 10;
		int h = 12;
		double res = 0.5*b*h;
		System.out.println(res);
	}
	void square()
	{
		int s = 10;
		int res = s*s;
		System.out.println(res);
	}
	void rectangle()
	{
		int l = 5;
		int b = 6;
		int res = l*b;
		System.out.println(res);
	}
	void parallelogram()
	{		
		int l = 5;
		int b = 6;
		int res = l*b;
		System.out.println(res);
	}
	void trapezaid()
	{
		int a = 10;
		int b = 12;
		int h = 13;
		double res = 0.5*(a+b)*h;
		System.out.println(res);
	}
	void sector()
	{
		int r = 10;
		int deg = 30;
		double res = 0.5*r*r*deg;
		System.out.println(res);
	}
	void ellipse()
	{
		int a = 10;
		int b = 15;
		double pi = 3.14;
		double res = pi*a*b;
		System.out.println(res);
	}
}
class Runnerarearef
{
	public static void main(String [] args)
	{
		Area area = new Area();
		area.circle();
		area.circle();

		System.out.println("*************************");

		Area area1 = new Area();
		area1.triangle();
		area1.triangle();

		System.out.println("*************************");

		Area area2 = new Area();
		area2.square();
		area2.square();

		System.out.println("*************************");

		Area area3 = new Area();
		area3.rectangle();
		area3.rectangle();

		System.out.println("*************************");

		Area area4 = new Area();
		area4.parallelogram();
		area4.parallelogram();

		System.out.println("*************************");

		Area area5 = new Area();
		area5.trapezaid();
		area5.trapezaid();

		System.out.println("*************************");

		Area area6 = new Area();
		area6.sector();
		area6.sector();

		System.out.println("*************************");

		Area area7 = new Area();
		area7.ellipse();
		area7.ellipse();
	}
}	