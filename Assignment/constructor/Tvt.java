class Tvt
{
	String name;
	int cost;
	String color;
	Tvt(String name,int cost,String color)
	{
		this.name = name;
		this.cost = cost;
		this.color = color;
	}
	public static void main (String [] args)
	{
		Tvt t = new Tvt("mi",20000,"black");
		System.out.println(t.name);
		System.out.println(t.cost);
		System.out.println(t.color);
	}
}