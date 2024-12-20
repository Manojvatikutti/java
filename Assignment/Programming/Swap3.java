class Swap3
{
	static void swap(int a,int b)
	{
		System.out.println("before swaping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swaping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	public static void main(String [] args)
	{
		swap(30 , 40);
	}
}
