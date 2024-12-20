class Tv
{
	int cost ;
	static String brand = "Sony";
	String tv_type;
	public static void main(String [] args)
	{
		Tv t1 = new Tv();
		t1.cost = 1000;
		t1.tv_type = "4k";
		System.out.println(t1.cost);
		System.out.println(brand);
		System.out.println(t1.tv_type);

		Tv t2 = new Tv();
		t2.cost = 2000;
		t2.tv_type = "4k LED";
		System.out.println(t2.cost);
		System.out.println(brand);
		System.out.println(t2.tv_type);
	}
}