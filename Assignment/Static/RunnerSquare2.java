class Square2
{
static int area(int s)
{
int res = s*s;
return res;
}
}
class RunnerSquare2
{
public static void main (String args [])
{
int store = Square2.area(8);
System.out.println(store);
}
}