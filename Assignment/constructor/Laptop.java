class Laptop
{
	String name;
	int cost;
	String brand;
	Laptop(String a,int b,String c)
	{
		name = a;
		cost = b;
		brand = c;
	}
	public static void main (String [] args)
	{
		Laptop l = new Laptop("mi",20000,"black");
		System.out.println(l.name);
		System.out.println(l.cost);
		System.out.println(l.brand);
	}
}