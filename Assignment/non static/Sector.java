class Sector
{
void area()
{
int r = 10;
int deg =20;
double res= 0.5*r*r*deg;
System.out.println(res);
}
public static void main(String [] args)
{
new Sector().area();
}
}