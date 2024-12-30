class Cloth
{
	String color;
	int cost;
	String size;
	Cloth(String a,int b,String c)
	{
		color = a;
		cost = b;
		size = c;
	}
	public static void main (String [] args)
	{
		Cloth c = new Cloth("red",999,"XL");
		System.out.println(c.color);
		System.out.println(c.cost);
		System.out.println(c.size);
	}
}