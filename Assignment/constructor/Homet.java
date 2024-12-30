class Homet
{
	String name;
	int cost;
	String color;
	Homet(String name,int cost,String color)
	{
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	public static void main (String [] args)
	{
		Homet h = new Homet("home",2000000,"White");
		System.out.println(h.name);
		System.out.println(h.cost);
		System.out.println(h.color);
	}
}