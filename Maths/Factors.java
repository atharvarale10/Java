import java.util.*;

class Factors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();

		int i=1;
		System.out.println("The factors are:");
		while(i<=a)
		{
			if(a%i==0)
			{//means a is divisible by i
				System.out.print(i+" ");
			}
			i++;
		}
	}

}