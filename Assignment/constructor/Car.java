class Car
{
	String name;
	int cost;
	String color;
	Car(String a,int b,String c)
	{
		name = a;
		cost = b;
		color = c;
	}
	public static void main (String [] args)
	{
		Car c = new Car("BMW",20000000,"black");
		System.out.println(c.name);
		System.out.println(c.cost);
		System.out.println(c.color);
	}
}