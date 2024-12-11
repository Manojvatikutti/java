class Circle
{
static void area()
{
int r =10;
final double pi = 3.14;
double res = pi*r*r;
System.out.println(res);
}
}
class RunnerCircle
{
public static void main (String [] args)
{
Circle.area();
}
}
