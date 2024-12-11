class Square
{
 int area(int s)
{
int res = s*s;
return res;
}
}
class SquareRunner
{
public static void main(String [] args)
{
double store = new Square().area(10);
System.out.println(store);
}
}