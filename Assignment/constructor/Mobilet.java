class Mobilet
{
	String brand;
	int cost;
	String color;
	Mobilet(String brand,int cost,String color)
	{
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	public static void main (String [] args)
	{
		Mobilet M = new Mobilet("mi",20000,"red");
		System.out.println(M.brand);
		System.out.println(M.cost);
		System.out.println(M.color);
	}
}