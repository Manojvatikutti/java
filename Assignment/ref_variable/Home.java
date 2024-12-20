class Home
{
static String name = "home";
int cost ;
String color;
public static void main(String [] args)
{
Home h1 = new Home();
h1.cost = 6700000;
h1.color = "white";
System.out.println(name);
System.out.println(h1.cost);
System.out.println(h1.color);
System.out.println("**********************");
Home h2 = new Home();
h1.cost = 6800000;
h1.color = "brown";
System.out.println(name);
System.out.println(h1.cost);
System.out.println(h1.color);
}
}