class Methodpara 
{
	static void add(int a, int b, int c)
	{
		System.out.println("sum of 3 numbers : "+(a+b+c));
	}
	static void sub(int x, int y, int z)
	{
		System.out.println("subtraction of 3 numbers : "+(x-y-z));
	}
	static void mul(int m, int n, int o)
	{
		System.out.println("multiplication of 3 numbers : "+(m*n*o));
	}
	public static void main(String[] args) 
	{
		add(2, 4, 10);
		sub(2, 4, 6);
		mul(2, 4, 6);
	}
}
