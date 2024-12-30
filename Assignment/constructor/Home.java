class Home
{
	String name;
	int cost;
	String color;
	Home(String a,int b,String c)
	{
		name = a;
		cost = b;
		color = c;
	}
	public static void main (String [] args)
	{
		Home h = new Home("home",2000000,"White");
		System.out.println(h.name);
		System.out.println(h.cost);
		System.out.println(h.color);
	}
}