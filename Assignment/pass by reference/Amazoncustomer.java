class Amazon
{
	void product()
	{
		System.out.println("order placed");
	}
}
class Ekart
{
	void delivery(Amazon a2)
	{
		a2.product();
	}
}
class Amazoncustomer 
{
	public static void main(String[] args) 
	{
		Amazon a1 = new Amazon();
		Ekart e1 = new Ekart();
		e1.delivery(a1);
	}
}
