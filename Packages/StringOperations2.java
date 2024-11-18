package pack2;
import pack1.StringOperations;
//in above statement we are importing StringOperations class from package named //pack1 into B.java
import java.util.*;

public class B
{
	public static void main(String args[])
	{
		StringOperations s=new StringOperations();
		int option;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice...1. upper case   2. lower case    3. concatenate:");
		option=sc.nextInt();

		switch(option)
		{
			case 1:String str1=s.upperCase();
				System.out.println("the upper case is "+str1);
				break;

			case 2:String str2=s.lowerCase();
				System.out.println("the lower case is "+str2);
				break;

			case 3:String str3=s.concatenate();
				System.out.println("the concatenated string is "+str3);
				break;


			default:System.out.println("invalid choice");

		}

	}
}
