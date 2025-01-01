class Flipkart
{
	void product()
	{
		System.out.println("order placed");
	}
}
class Ekart
{
	void delivery(Flipkart f2)
	{
		f2.product();
	}
}
class Flipkartcustomer 
{
	public static void main(String[] args) 
	{
		Flipkart f1 = new Flipkart();
		Ekart e1 = new Ekart();
		e1.delivery(f1);
	}
}