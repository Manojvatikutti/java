class Biket
{
	String name;
	int cost;
	String color;
	Biket(String name,int cost,String color)
	{
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	public static void main (String [] args)
	{
		Biket b = new Biket("hero",200000,"red");
		System.out.println(b.name);
		System.out.println(b.cost);
		System.out.println(b.color);
	}
}