class Varier_bekary
{
	void bun()
	{
		System.out.println("tasty bun");
	}
}
class Bigbasket
{
	void book(Varier_bekary v2)
	{
		v2.bun();
	}
}
class  Variercustomer
{
	public static void main(String[] args) 
	{
		Varier_bekary v1 = new Varier_bekary();
		Bigbasket b1 = new Bigbasket();
		b1.book(v1);
	}
}
