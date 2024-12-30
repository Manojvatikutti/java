class Cart
{
	String name;
	int cost;
	String color;
	Cart(String name,int cost,String color)
	{
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	public static void main (String [] args)
	{
		Cart c = new Cart("BMW",20000000,"black");
		System.out.println(c.name);
		System.out.println(c.cost);
		System.out.println(c.color);
	}
}