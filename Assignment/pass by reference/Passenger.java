class Metro
{
	void greenline()
	{
		System.out.println("green line ticket booked");
	}
	void purpleline()
	{
		System.out.println(" purple line Ticket booked");
	}
}
class Nammametro
{
	void book(Metro m2)
	{
		m2.greenline();

		m2.purpleline();
	}
}
class  Passenger
{
	public static void main(String[] args) 
	{
		Metro m1 = new Metro();
		new Nammametro().book(m1);
	}
}
