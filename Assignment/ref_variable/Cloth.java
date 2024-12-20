class Cloth
{
static String color = "red";
int cost ;
String size;
public static void main(String [] args)
{
Cloth c1 = new Cloth();
c1.cost = 499;
c1.size = "x";
System.out.println(color);
System.out.println(c1.cost);
System.out.println(c1.size);
System.out.println("**********************");
Cloth c2 = new Cloth();
c2.cost = 799;
c2.size = "xl";
System.out.println(color);
System.out.println(c2.cost);
System.out.println(c2.size);
}
}