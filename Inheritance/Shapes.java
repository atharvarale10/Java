import java.util.*;

abstract class Shape
{
	int radius, height;
	Scanner sc = new Scanner(System.in);
	public Shape()
	{
		System.out.println("Enter the radius: ");
		radius = sc.nextInt();

		System.out.println("Enter the height: ");
		height = sc.nextInt();

	}

	public abstract double area();
	public abstract double volume();

}

class Cone extends Shape
{
	public Cone()
	{
		super();
	}

	public double area()
	{
		double a = (Math.PI)*radius*(radius+height);
		return a;
	}

	public double volume()
	{
		double v = ((Math.PI)*radius*radius*height)/3;
		return v;
	}

}

class Cylinder extends Shape
{
	public Cylinder()
	{
		super();
	}

	public double area()
	{
		double a = (Math.PI)*radius*(radius+height);
		return a;
	}

	public double volume()
	{
		double v = (Math.PI)*radius*radius*height;
		return v;
	}

}

class Main
{
	public static void main(String args[])
	{
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		option = sc.nextInt();

		switch(option)
		{
			case 1: Cone c= new Cone();
				double a=c.area();
				double v=c.volume();
				System.out.println("The area is"+a);
				System.out.println("The volume is"+v);

			case 2: Cylinder c1 = new Cylinder();
				double a1=c1.area();
				double v1=c1.volume();
				System.out.println("The area is"+a1);
				System.out.println("The volume is"+v1);

		}
	}
}








