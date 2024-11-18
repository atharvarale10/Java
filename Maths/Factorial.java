import java.util.*;

class Factorial
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();

		long fact=1;
		//when we multiply many nos the initial value of variable we use //for finding product must startb from 1, so initially fact=1

		int i=1;
		while(i<=a)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("the factorial is "+fact);
	}
}