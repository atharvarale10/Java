/*
accept 2 numbers from user and perform their division. If the divisor is 0 then generate ArithmaticException manually. Catch and handle the exception and display appropriate error message to user. If divisor is not 0, then perform actual division and display result
*/
import java.util.*;

class Division
{
	private int a,b;
	Scanner sc=new Scanner(System.in);

	public Division()
	{
		System.out.println("Enter 2 integers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}

	public void divide()
	{
		try
		{
			if(b==0)
			{
				ArithmeticException e1=new ArithmeticException("Divisor cannot be 0");
				throw e1;
			}

			float c=((float)a)/b;
			System.out.println("The division is "+c);
		}

		catch(ArithmeticException e)
		{
			e.printStackTrace();
/*
Explanation: printStackTrace() is predefined function of ArithmeticException lass. It displays details regarding exception which is name of exception class, message describing exception "Divisor cannot be 0" at which line did exception occur, in which function...
*/
		}
	}

	public static void main(String args[])
	{
		Division d=new Division();
		d.divide();
	}
}