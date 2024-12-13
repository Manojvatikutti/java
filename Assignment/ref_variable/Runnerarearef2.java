class Area2
{
	double circle()
	{
		int r = 5;
		final double pi = 3.14;
		double res = pi*r*r;
		return res;
	}
	double triangle()
	{
		int b = 10;
		int h = 12;
		double res = 0.5*b*h;
		return res;
	}
	int square()
	{
		int s = 10;
		int res = s*s;
		return res;
	}
	int rectangle()
	{
		int l = 5;
		int b = 6;
		int res = l*b;
		return res;
	}
	int parallelogram()
	{		
		int l = 5;
		int b = 6;
		int res = l*b;
		return res;
	}
	double trapezaid()
	{
		int a = 10;
		int b = 12;
		int h = 13;
		double res = 0.5*(a+b)*h;
		return res;
	}
	double sector()
	{
		int r = 10;
		int deg = 30;
		double res = 0.5*r*r*deg;
		return res;
	}
	double ellipse()
	{
		int a = 10;
		int b = 15;
		double pi = 3.14;
		double res = pi*a*b;
		return res;
	}
}
class Runnerarearef2
{
	public static void main(String [] args)
	{
		Area2 area = new Area2();
		double a = area.circle();
		double b = area.circle();
		System.out.println(a);
		System.out.println(b);

		System.out.println("*************************");

		Area2 area1 = new Area2();
		double c = area1.triangle();
		double d = area1.triangle();
		System.out.println(c);
		System.out.println(d);

		System.out.println("*************************");

		Area2 area2 = new Area2();
		int e = area2.square();
		int f = area2.square();
		System.out.println(e);
		System.out.println(f);

		System.out.println("*************************");

		Area2 area3 = new Area2();
		int g = area3.rectangle();
		int h = area3.rectangle();
		System.out.println(g);
		System.out.println(h);

		System.out.println("*************************");

		Area2 area4 = new Area2();
		int i = area4.parallelogram();
		int j = area4.parallelogram();
		System.out.println(i);
		System.out.println(j);

		System.out.println("*************************");

		Area2 area5 = new Area2();
		double k = area5.trapezaid();
		double l = area5.trapezaid();
		System.out.println(k);
		System.out.println(l);

		System.out.println("*************************");

		Area2 area6 = new Area2();
		double m = area6.sector();
		double n = area6.sector();
		System.out.println(m);
		System.out.println(n);

		System.out.println("*************************");

		Area2 area7 = new Area2();
		double o = area7.ellipse();
		double p = area7.ellipse();
		System.out.println(o);
		System.out.println(p);
	}
}