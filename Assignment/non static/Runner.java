class Triangle
{
 double area(int b,int h)
{
double res = 0.5*b*h;
return res;
}
}
class Runner
{
public static void main(String [] args)
{
double store = new Triangle().area(10 , 12);
System.out.println(store);
}
}