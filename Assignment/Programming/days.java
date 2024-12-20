class days
{
  static String demo( int day)
	{
 String res=null;
 switch(day)
 {
  case 12:
  case 1:
  case 2:
	 {
	  res="winter";
        
	 }break;
 case 3:
 case 4:
 case 5:
	 {
	 res="summer";
       
	 }break;
 case 6:
 case 7:
 case 8:
	 {
		res="rainy";
	 }
	 break;
 case 9:
 case 10:
 case 11:
	 {
	 res="autum";
 
	 }break;
	 default: res = "invalid";
 }
   return res;
   }
  public static void main(String[] args)
 {
 	String a=days.demo(2);
	System.out.println(a);
	}
	}