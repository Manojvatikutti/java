class Tv
{
	String name;
	int cost;
	String color;
	Tv(String a,int b,String c)
	{
		name = a;
		cost = b;
		color = c;
	}
	public static void main (String [] args)
	{
		Tv t = new Tv("mi",20000,"black");
		System.out.println(t.name);
		System.out.println(t.cost);
		System.out.println(t.color);
	}
}