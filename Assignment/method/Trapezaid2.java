class Trapezoid2
{
static double area(int a, int b , int h)
{
double res = 0.5(a+b)*h;
return res;
}
public static void main (String args [])
{
double store = area(10,12, 13);
System.out.println(store);
}
}