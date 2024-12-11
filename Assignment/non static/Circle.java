class Circle
{
void area(int r)
{
final double pi = 3.14;
double res = pi*r*r;
System.out.println(res);
}
public static void main(String [] args)
{
new Circle().area(5);
}
}