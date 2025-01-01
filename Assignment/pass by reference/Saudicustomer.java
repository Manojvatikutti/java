class Saudi
{
	void petrol()
	{
		System.out.println("petrol received");
	}
}
class Indianoil
{
	void imports(Saudi s2)
	{
		s2.petrol();
	}
}
class Saudicustomer 
{
	public static void main(String[] args) 
	{
		Saudi s1 = new Saudi();
		new Indianoil().imports(s1);
	}
}