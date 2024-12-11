class Triangle2
{
static double area(int b, int h)
{
double res = 0.5*b*h;
return res;
}
}
class RunnerTriangle2
{
public static void main (String args [])
{
double store = Triangle2.area(10,12);
System.out.println(store);
}
}