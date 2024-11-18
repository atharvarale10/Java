//write package for games in java which have 2 classes. Indoor and Outdoor
//use function display() to generate list of players for specific games.
//use parameterised constructor,  and array of objects

package games;
import java.util.*;
class Indoor
{
	private String pname;
	private int page;
	private int nmatches;

	public Indoor(String pname1,int page1,int nmatches1)
	{
		pname=pname1;
		page=page1;
		nmatches=nmatches1;
	}

	public void display()
	{
		System.out.println("The name of player is "+pname);
		System.out.println("The age of player is "+page);
		System.out.println("The no. of matches is "+nmatches);
	}

}

class Outdoor
{
	private String pname;
	private int page;
	private int nmatches;

	public Outdoor(String pname1,int page1,int nmatches1)
	{
		pname=pname1;
		page=page1;
		nmatches=nmatches1;
	}

	public void display()
	{
		System.out.println("The name of player is "+pname);
		System.out.println("The age of player is "+page);
		System.out.println("The no. of matches is "+nmatches);
	}

}

class Main
{
	public static void main(String args[])
	{
		Indoor arr1[];
		Outdoor arr2[];
		int n;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice...1. Indoor player    2. Outdoor player:");
		int option=sc.nextInt();
		switch(option)
		{
			case 1: System.out.println("Enter no. of indoor players:");
				n=sc.nextInt();
				arr1=new Indoor[n];
				System.out.println("Enter details of each indoor player:");
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter name of player no."+(i+1));
					String pname2=sc.next();

					System.out.println("Enter age of player no."+(i+1));
					int page2=sc.nextInt();

					System.out.println("Enter no. of matches of player no."+(i+1));
					int nmatches2=sc.nextInt();

					Indoor in=new Indoor(pname2,page2,nmatches2);
					arr1[i]=in;

				}

				System.out.println("The details of indoor players are:");
				for(int i=0;i<n;i++)
				{
					arr1[i].display();
				}
				break;
				

				case 2: System.out.println("Enter no. of outdoor players:");
				n=sc.nextInt();
				arr2=new Outdoor[n];
				System.out.println("Enter details of each outdoor player:");
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter name of player no."+(i+1));
					String pname2=sc.next();

					System.out.println("Enter age of player no."+(i+1));
					int page2=sc.nextInt();

					System.out.println("Enter no. of matches of player no."+(i+1));
					int nmatches2=sc.nextInt();

					Outdoor out=new Outdoor(pname2,page2,nmatches2);
					arr2[i]=out;

				}

				System.out.println("The details of outdoor players are:");
				for(int i=0;i<n;i++)
				{
					arr2[i].display();
				}
				break;

			default:System.out.println("Invalid choice");

		}
	

	}

}
