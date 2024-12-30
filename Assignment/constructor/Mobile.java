class Mobile
{
	String name;
	int cost;
	String color;
	Mobile(String a,int b,String c)
	{
		name = a;
		cost = b;
		color = c;
	}
	public static void main (String [] args)
	{
		Mobile m = new Mobile("mi",20000,"black");
		System.out.println(m.name);
		System.out.println(m.cost);
		System.out.println(m.color);
	}
}