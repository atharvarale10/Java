import java.util.*;

class NumberDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();

		int count=0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println("The no. of digits is "+cnt);

/*
Explanation:
Each time loop runs. a=a/10 removes last digit from value of a. The cnt++ will increase value of cnt by 1. After all digits are removed from a, the value of a becomes 0, then loop ends. The value of cnt after a=0 is no. of digits. 

Let a is 7899
when loop runs 1st time, 
a=7899/10=789.9=789
a=789
cnt=0+1=1


a=789,cnt=1
when loop runs 2nd time,
a=789/10=78.9=78
cnt=1+1=2
....

*/
	}

}
