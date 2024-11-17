//write program for single inheritance
/*
University
data members:uname,uaddress
member functions: acceptUniversity(),displayUniversity()

College is subclass of University
data members:cname,caddress
member functions:acceptCollege(),displayCollege()
*/
import java.io.*;

class University
{
	private String uname,uaddress;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public void acceptUniversity()throws IOException
	{
		System.out.println("Enter university name:");
		uname=br.readLine();

		System.out.println("enter university address:");
		uaddress=br.readLine();
	}
	
	public void displayUniversity()
	{
		System.out.println("The university name is "+uname);
		System.out.println("The university address is "+uaddress);
	}

}
/*
Explanation:
BufferedReader is predefined class in java.io package.
To create object of BufferedReader we pass InputStreamReader object to it. Inside object of InputStreamReader we pass System.in

BufferedReader class object is used for accepting string value with spaces in it.
When we use Scanner we cant type spaces in input.

When we call readLine() method of BufferedReader class we must declare IOException which is checked exception using throws keyword else we get syntax error.


*/
class College extends University
{
	private String cname,caddress;

	public void acceptCollege()throws IOException
	{
		System.out.println("Enter college name:");
		cname=br.readLine();

		System.out.println("enter college address:");
		caddress=br.readLine();
	}
	
	public void displayCollege()
	{
		System.out.println("The college name is "+cname);
		System.out.println("The college address is "+caddress);
	}

}

class Main
{
	public static void main(String args[])throws IOException
	{
		College c1=new College();
		c1.acceptUniversity();
		c1.acceptCollege();
		c1.displayUniversity();
		c1.displayCollege();
	}

}
