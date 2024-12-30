class Course
{
	String name;
	String uname;
	int cost;
	Course(String a,String b,int c)
	{
		name = a;
		uname = b;
		cost = c;
	}
	public static void main (String [] args)
	{
		Course c = new Course("MCA","VTU",90000);
		System.out.println(c.name);
		System.out.println(c.uname);
		System.out.println(c.cost);
	}
}