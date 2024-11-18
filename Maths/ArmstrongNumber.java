//write java program to accept number and find if entered number is //Armstrong number
/*
it is number whose sum of cubes of digits is original number
153=cube of 1+cube of 5+cube of 3
*/
import java.util.*;

class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		int b=a;
/*
Explanation: Here original value of a is stored in b, because inside loop a becomes 0. So original number is not in a after loop ends. 
*/
		double sum=0;
		while(a!=0)
		{
			sum=sum+Math.pow(a%10,3);
			a=a/10;
			//this statement actually removes last digit
			
		}
//after loop sum stores sum of cubes of digits

		if(sum==b)
		{
			System.out.println("entered number is Armstrong");
		}

		else
		{
			System.out.println("entered number is not Armstrong");
		}

	}

}