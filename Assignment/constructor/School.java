class School
{
	String name;
	int cost;
	char grade;
	School(String a,int b,char c)
	{
		name = a;
		cost = b;
		grade = c;
	}
	public static void main (String [] args)
	{
		School s = new School("VCVR",2000000,'A');
		System.out.println(s.name);
		System.out.println(s.cost);
		System.out.println(s.grade);
	}
}