import java.util.*;

class PrimeComposite
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		int cnt=0;

		if(a==1)
		{
			System.out.println("neither prime nor composite");
		}

		else
		{
		int i=1;
		while(i<=a)
		{
			if(a%i==0)
			{//means a is divisible by i
				cnt++;
			}
			i++;
		}
		//cnt is keeping track of no. of factors of a. So we //have written cnt++ inside if block and in loop. The i ++ is written //outside if but inside loop because i is just to go to every new number //from 1 to a
			if(cnt==2)
			{
				System.out.println("The number is prime");
			}
			else
			{
				System.out.println("The number is composite");
			}
		}
	}

}