class Bike
{
int cost;
static String brand = "hero";
String color ;
public static void main(String [] args)
{
Bike b1 = new Bike();
b1.cost = 100000;
b1.color = "red";
System.out.println(b1.cost);
System.out.println(brand);
System.out.println(b1.color);
System.out.println("**********************");
Bike b2 = new Bike();
b2.cost = 200000;
b2.color = "green";
System.out.println(b2.cost);
System.out.println(brand);
System.out.println(b2.color);
}
}