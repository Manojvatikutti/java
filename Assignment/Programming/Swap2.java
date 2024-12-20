class Swap2
{
	static void swap(int a,int b)
	{
		System.out.println("before swaping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swaping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	public static void main(String [] args)
	{
		swap(130 , 40);
	}
}