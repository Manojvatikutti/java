class Day
{
	static String day(int day)
	{
		String res = null;
		switch(day)
		{
			case 1: res = "sunday";
				   break;
			case 2: res = "monady";
					break;
			case 3: res = "tuesday";
					break;
			case 4: res = "wednesday";
					break;
			case 5: res = "thursday";
					break;
			case 6: res = "friday";
					break;
			case 7: res = "saturday";
					break;
			default : res = "invalid";
			
		}
		return res;
	}
	public static void main(String [] args)
	{
		String result = day(4);
				System.out.println(result);
	}
}