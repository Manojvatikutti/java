class Ksrtc
{
	void ride()
	{
		System.out.println("bus ticket booked");
	}
}
class Redbus
{
	static void book(Ksrtc k2)
	{
		k2.ride();
	}
}
class Ksrtcuser 
{
	public static void main(String[] args) 
	{
		Ksrtc k1 = new Ksrtc();
		Redbus.book(k1);
	}
}
