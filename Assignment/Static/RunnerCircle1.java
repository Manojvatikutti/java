class Circle1
{
static void area(int r)
{
final double pi = 3.142;
double result= pi*r*r;
System.out.println(" Area is "+result);
}
}
class RunnerCircle1
{
public static void main(String [] args)
{
Circle1.area(10);
}
}