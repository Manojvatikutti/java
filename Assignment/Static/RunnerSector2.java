class Sector2
{
static double area(int r, int deg)
{
double res = 0.5*r*r*deg;
return res;
}
}
class RunnerSector2
{
public static void main (String args [])
{
double store = Sector2.area(10,12);
System.out.println(store);
}
}