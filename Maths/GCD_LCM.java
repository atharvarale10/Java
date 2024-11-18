import java.util.*;

class GcdLcm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,gcd=0;
		System.out.println("Enter 2 nos:");
		a=sc.nextInt();
		b=sc.nextInt();
		int i;
		i=1;

		while(i<=a && i<=b)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
			i++;
		}
		int lcm=(a*b)/gcd;
		System.out.println("The gcd is "+gcd);				
		System.out.println("The lcm is "+lcm);


/*
Explanation:
Every time loop runs, if condition of if block is true it means i is common factor of a,b.
Then we store i value in gcd if it is common factor.
The loop ends if i crosses a or b.
After loop ends, automatically gcd variable will store greatest common factor.

*/
	}

}
