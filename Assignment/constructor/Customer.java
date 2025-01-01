class Cabdriver
{
	void ride()
	{
		System.out.println("ride confirmed");
	}
}
class Ola
{
	static void book(Cabdriver c2)
	{
		c2.ride();
	}
}
class Customer
{
	public static void main (String [] args)
	{
		Cabdriver c1 = new Cabdriver();
		Ola.book(c1);
	}
}