class Cricket
{
	void T20()
	{
		System.out.println("T20 score");
	}
	void ODI()
	{
		System.out.println("ODI score");
	}
	void Test()
	{
		System.out.println("Test score");
	}
}
class Cricbuzz
{
	void Score(Cricket c2)
	{
		c2.T20();
		c2.Test();
	}
}
class User 
{
	public static void main(String[] args) 
	{
		Cricket c1 = new Cricket();
		new Cricbuzz().Score(c1);
	}
}
