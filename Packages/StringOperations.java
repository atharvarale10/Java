/*
write java application which contains 2 programs, one program is named StringOperations.java, and 2nd program is named B.java. In StringOperations.java, there is class called StringOperations, which has data member str, and member methods constructor, opns() which will convert string uppercase, lower case and concatenate. Access these functions of A.java in B.java

*/
package pack1;
import java.util.*;
public class StringOperations
{
	private String str;
	Scanner sc=new Scanner(System.in);

	public StringOperations()
	{
		System.out.println("Enter string:");
		str=sc.next();
	}

	public String upperCase()
	{
		str=str.toUpperCase();
		return str;
	}

	public String lowerCase()
	{
		str=str.toLowerCase();
		return str;
	}

	public String concatenate()
	{
		System.out.println("Enter string to be concatenated:");
		String str2=sc.next();
		return (str+str2);	
	}
}
/*
Explanation: Here class StringOperations is defined as public because we want to access class outside package in other java program. If we take public class, we can access it in different package and in different java program.

*/
