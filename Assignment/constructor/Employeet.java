class Employeet
{
	String name;
	int id;
	int salary;
	Employeet(String name,int id,int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public static void main (String [] args)
	{
		Employeet e = new Employeet("manoj",2,40000);
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println(e.salary);
	}
}