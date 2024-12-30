class Laptopt
{
	String name;
	int cost;
	String brand;
	Laptopt(String name,int cost,String brand)
	{
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}
	public static void main (String [] args)
	{
		Laptopt l = new Laptopt("mi",20000,"black");
		System.out.println(l.name);
		System.out.println(l.cost);
		System.out.println(l.brand);
	}
}