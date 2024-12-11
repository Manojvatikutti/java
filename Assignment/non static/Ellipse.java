class Ellipse
{
void area()
{
int a = 10;
int b =20;
final double pi = 3.14;
double res= pi*a*b;
System.out.println(res);
}
public static void main(String [] args)
{
new Ellipse().area();
}
}