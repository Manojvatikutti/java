class Dominos
{
	void pizza()
	{
		System.out.println("order confirmed");
	}
}
class Delivery
{
	static void order(Dominos d2)
	{
		d2.pizza();
	}
}
class Pizzacustomer 
{
	public static void main(String[] args) 
	{
		Dominos d1 = new Dominos();
		Delivery.order(d1);
	}
}
