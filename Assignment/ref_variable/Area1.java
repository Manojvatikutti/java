class Area1
{
	void circle(int r)
	{
		final double pi = 3.14;
		double res = pi*r*r;
		System.out.println(res);
	}
	void triangle(int b,int h)
	{
		double res = 0.5*b*h;
		System.out.println(res);
	}
	void square(int s)
	{
		int res = s*s;
		System.out.println(res);
	}
	void rectangle(int l,int b)
	{
		int res = l*b;
		System.out.println(res);
	}
	void parallelogram(int l, int b)
	{		
		int res = l*b;
		System.out.println(res);
	}
	void trapezaid(int a,int b,int h)
	{
		double res = 0.5*(a+b)*h;
		System.out.println(res);
	}
	void sector(int r,int deg)
	{
		double res = 0.5*r*r*deg;
		System.out.println(res);
	}
	void ellipse(int a,int b)
	{
		double pi = 3.14;
		double res = pi*a*b;
		System.out.println(res);
	}
	public static void main(String [] args)
	{
		Area1 area = new Area1();
		area.circle(5);
		area.circle(7);

		System.out.println("*************************");

		Area1 area1 = new Area1();
		area1.triangle(5,6);
		area1.triangle(6,7);

		System.out.println("*************************");

		Area1 area2 = new Area1();
		area2.square(5);
		area2.square(7);

		System.out.println("*************************");

		Area1 area3 = new Area1();
		area3.rectangle(6,7);
		area3.rectangle(8,9);

		System.out.println("*************************");

		Area1 area4 = new Area1();
		area4.parallelogram(3,4);
		area4.parallelogram(5,6);

		System.out.println("*************************");

		Area1 area5 = new Area1();
		area5.trapezaid(3,4,5);
		area5.trapezaid(5,6,7);

		System.out.println("*************************");

		Area1 area6 = new Area1();
		area6.sector(5,30);
		area6.sector(7,50);

		System.out.println("*************************");

		Area1 area7 = new Area1();
		area7.ellipse(5,6);
		area7.ellipse(10,11);
	}
}