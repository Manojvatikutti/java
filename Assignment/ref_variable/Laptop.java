class Laptop
{
String name;
int cost ;
static String brand = "Asus" ;
public static void main(String [] args)
{
Laptop l1 = new Laptop();
l1.name = "vivobook";
l1.cost = 55000;
System.out.println(l1.name);
System.out.println(l1.cost);
System.out.println(brand);
System.out.println("**********************");
Laptop l2 = new Laptop();
l1.name = "tuf gaming";
l1.cost = 78000;
System.out.println(l1.name);
System.out.println(l1.cost);
System.out.println(brand);
}
}