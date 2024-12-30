class Schoolt
{
	String name;
	int cost;
	char grade;
	Schoolt(String name,int cost,char grade)
	{
		this.name = name;
		this.cost = cost;
		thisgrade = grade;
	}
	public static void main (String [] args)
	{
		Schoolt s = new Schoolt("VCVR",2000000,'A');
		System.out.println(s.name);
		System.out.println(s.cost);
		System.out.println(s.grade);
	}
}