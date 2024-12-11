class Circle2
{
static double area(int r)
{
final double pi = 3.14;
double res = pi*r*r;
return res;
}
public static void main (String args [])
{
double store = area(5);
System.out.println(store);
}
}