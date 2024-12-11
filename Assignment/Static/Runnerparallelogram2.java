class parallelogram2
{
static int area(int l, int b)
{
int res = l*b;
return res;
}
}
class Runnerparallelogram2
{
public static void main (String args [])
{
int store = parallelogram2.area(10,12);
System.out.println(store);
}
}