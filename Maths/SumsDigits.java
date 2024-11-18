import java.util.*;

class SumDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();

		int sum=0;
		while(a!=0)
		{
			sum=sum+(a%10);
			//a%10 extracts last digit from a but doesn't remove last digit
			a=a/10;
			//this statement actually removes last digit
			
		}
		System.out.println("The sum of digits is "+sum);

	}

}
