import java.util.*;

class Fibonaci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many terms:");
		int n=sc.nextInt();

		if(n==1)
		{
			System.out.print("0");
		}

		else if(n==2)
		{
			System.out.println("0 1");
		}

		else
		{
			//means no. of terms are more than 2
			System.out.print("0 1 ");
			int first=0,second=1, third;

			for(int i=1;i<=n-2;i++)
			{
				third=first+second;
				System.out.print(third+" ");
				first=second;
				second=third;
			}
/*
Explanation: Here each time the for loop runs, we are displaying thirds by adding current values of first and seciond.third represents next term to be displayed in series. 
Each time the for lopp runs, we are also moving first and second 1 position ahead in series using statements first=second and second=third.
Because we have displayed already 2 terms above loop so n-2 terms are remaining to be displayed, so for loop runs n-2 times.
*/
		}
	}

}
