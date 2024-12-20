class Car
{
	static String car_name = "audi";
	int cost;
	String type;
public static void main (String[] args)
	{
	Car c1 = new Car();
	c1.cost = 100000;
	c1.type = "petrol";
	System.out.println(car_name);
	System.out.println(c1.cost);
	System.out.println(c1.type);
	}
}