class School
{
	static String school_name = "vcvr";
	String school_grade;
	static int school_strength = 200;
	public static void main(String [] args)
	{
		School s1 = new School();
		s1.school_grade = "A";
		System.out.println(school_name);
		System.out.println(s1.school_grade);
		System.out.println(school_strength);
	}
}