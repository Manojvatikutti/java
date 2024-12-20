
class Prime
{
public static void main(String [] args)
	{
	int num = 149;
	boolean flag = true;
	for(int i=num;i<=Math.sqrt(num);i++)
		{
		if(num%i == 0)
		{
			flag = false;
			break;
		}
		}
if(flag == true)
		{
	System.out.println(num+" is a prime ");
		}
		else
		{
	System.out.println(num+" is not a prime ");
		}
	}
}