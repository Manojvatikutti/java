class Method
{
static void add()
{
int a=10;
int b=20;
int c=40;
int sum = a+b+c;
System.out.println("sum of 3 numbers : "+sum);
}
static void sub()
{
int x=50;
int y=20;
int z=40;
int sub = x-y-z;
System.out.println("sum of 3 numbers : "+sub);
}
static void mul(int m, int n, int o)
{
int mul = m*n*o;
System.out.println("sum of 3 numbers : "+mul);
}
public static void main (String [] args)
{
add();
sub();
mul(4, 7, 6);
}
}