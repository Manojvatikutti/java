class Rectangle2
{
  static int area(int l, int b)
   {
     int res = l*b;
     return res;
   }
}
class RunnerRectangle2
{
 public static void main (String args [])
 {
   int store = Rectangle2.area(10, 8);
   System.out.println(store);
 }
}