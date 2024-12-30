class Bike
{
	String name;
	int cost;
	String color;
	Bike(String a,int b,String c)
	{
		name = a;
		cost = b;
		color = c;
	}
	public static void main (String [] args)
	{
		Bike b = new Bike("hero",200000,"red");
		System.out.println(b.name);
		System.out.println(b.cost);
		System.out.println(b.color);
	}
}