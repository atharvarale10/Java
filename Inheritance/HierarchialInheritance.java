/*
pgm for hierarchial inheritance

Use constructor and overriding

*/
import java.util.*;

class Player
{
	private String pname;
	private int page,nmatches;
	private String cname;

	Scanner sc=new Scanner(System.in);
	public Player()
	{
		System.out.println("Enter player name:");
		pname=sc.next();

		System.out.println("enter player age:");
		page=sc.nextInt();
	
		System.out.println("enter player no. of matches:");
		nmatches=sc.nextInt();

		System.out.println("enter country name:");
		cname=sc.next();
	}

	public void display()//overridden method
	{
		System.out.println("The player name is "+pname);
		System.out.println("The player age is "+page);
		System.out.println("The player country name is "+cname);

	}
	

}

class CricketPlayer extends Player
{
	private int nruns,nwickets;

	public CricketPlayer()	
	{
		super();//calls direct superclass constructor from subclass //constructor

		System.out.println("enter how many runs:");
		nruns=sc.nextInt();

		System.out.println("enter how many wickets:");
		nwickets=sc.nextInt();

	}

	public void display()//overriding method
	{
		super.display();
		//above statement calls verridden display from overriding display //of subclass
		System.out.println("The cricket player no. of runs is "+nruns);
		System.out.println("The cricket player no. of wickets is "+nwickets);

	}
}


class HockeyPlayer extends Player
{
	private int ngoals;

	public HockeyPlayer()	
	{
		super();//calls direct superclass constructor from subclass //constructor

		System.out.println("enter how many goals:");
		ngoals=sc.nextInt();

		
	}

	public void display()//overriding method
	{
		super.display();
		
		System.out.println("The hockey player no. of goals is "+ngoals);
		
	}
}


class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int option;
		System.out.println("enter which player....1. cricket player   2. hockey player:");
		option=sc.nextInt();

		switch(option)
		{
			case 1:CricketPlayer c1=new CricketPlayer();
				c1.display();
				break;

			case 2:HockeyPlayer h1=new HockeyPlayer();
				h1.display();
				break;

			default: System.out.println("invalid choice");
		}
	}

}
