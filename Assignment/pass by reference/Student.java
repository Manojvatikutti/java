class Ibm
{
	void job()
	{
		System.out.println("you are selected");
	}
}
class Naukri
{
	static void apply(Ibm i2)
	{
		i2.job();
	}
}
class Student
{
	public static void main(String [] args)
	{
		Ibm i1 = new Ibm();
		Naukri.apply(i1);
	}
}