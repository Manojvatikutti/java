class Employee
{
	String name;
	int id;
	int salary;
	Employee(String a,int b,int c)
	{
		name = a;
		id = b;
		salary = c;
	}
	public static void main (String [] args)
	{
		Employee e = new Employee("manoj",2,40000);
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println(e.salary);
	}
}