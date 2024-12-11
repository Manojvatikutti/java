class Ellipse2
{
static double area(int a, int b)
{
final double pi = 3.14;
double res = pi*a*b;
return res;
}
public static void main (String args [])
{
double store = area(10,12);
System.out.println(store);
}
}