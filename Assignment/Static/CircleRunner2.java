class Circle
{
static double area(int r)
{
final double pi = 3.14;
double res = pi*r*r;
return res;
}
}
class CircleRunner2
{
public static void main (String args [])
{
double store = Circle.area(5);
System.out.println(store);
}
}