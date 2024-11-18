/*
Square
data member:side
member function: constructor, perimeter()

Class Rectangle is subclass of Square
data member: breadth
member function:constructor,perimeter()

Class Triangle is subclass of Rectangle
data member:side3
member function:constructor,perimeter()

accept lengths of sides of triangle,rectangle and square and display perimeter of each

*/
import java.util.*;

class Square
{
	int side;
	Scanner sc=new Scanner(System.in);
	public Square()
	{
		System.out.println("Enter side of square:");
		side=sc.nextInt();
	} 

	public void perimeter()
	{
		System.out.println("The perimeter of square is "+(4*side));
	}
}

class Rectangle extends Square
{
	int breadth;
	
	public Rectangle()
	{
		super();
		//calls the constructor of direct superclass Square
			//This is compulsorily 1st statement inside //constructor

		System.out.println("Enter breadth of rectangle:");
		breadth=sc.nextInt();
	}

	public void perimeter()
	{
		super.perimeter();
		System.out.println("The perimeter of rectangle is "+2*(side+breadth));
	}
}

class Triangle extends Rectangle
{
	int side3;
	public Triangle()
	{
		super();
		System.out.println("Enter 3rd side of triangle:");
		side3=sc.nextInt();
		
	}

	public void perimeter()
	{
	    super.perimeter();
		System.out.println("The perimeter of triangle is "+(side+breadth+side3));
		
	}

}


class Main
{
	public static void main(String args[])
	{
		Triangle t1=new Triangle();
		t1.perimeter();		
	}

}