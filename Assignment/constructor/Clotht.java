class Clotht
{
	String color;
	int cost;
	String size;
	Clotht(String color,int cost,String size)
	{
		this.color = color;
		this.cost = cost;
		this.size = size;
	}
	public static void main (String [] args)
	{
		Clotht c = new Clotht\("red",999,"XL");
		System.out.println(c.color);
		System.out.println(c.cost);
		System.out.println(c.size);
	}
}