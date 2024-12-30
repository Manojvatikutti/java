class Courset
{
	String name;
	String uname;
	int cost;
	Courset(String name,String uname,int cost)
	{
		this.name = name;
		this.uname = uname;
		this.cost = cost;
	}
	public static void main (String [] args)
	{
		Courset c = new Courset("MCA","VTU",90000);
		System.out.println(c.name);
		System.out.println(c.uname);
		System.out.println(c.cost);
	}
}