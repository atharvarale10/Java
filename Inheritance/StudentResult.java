/*

Result is subclass of Exam,Student
Accept details of student and calculate Result
*/


import java.util.*;
interface Exam
{
	void per_cal();
}

class Student
{
	String name;
	int rollno;
	int m1,m2;
	Scanner sc=new Scanner(System.in);

	public Student()
	{
		System.out.println("Enter name of student:");
		name=sc.next();

		System.out.println("Enter rollno of student:");
		rollno=sc.nextInt();

		System.out.println("Enter marks of 1st subject of student:");
		m1=sc.nextInt();

		System.out.println("Enter marks of 2nd subject of student:");
		m2=sc.nextInt();

		
	}

}

class Result extends Student implements Exam
{
	private float per;
	public Result()
	{
		super();
	}

	public void per_cal()
	{
		per=(m1+m2)/2;	
	}

	public void displayResult()
	{
		System.out.println("The name of student is "+name);
		System.out.println("The rollno of student is "+rollno);
		System.out.println("The percentage of student is "+per);
		System.out.println("The marks of 2 subjects of student is "+m1+" "+m2);
		
	}

}

class Main
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.per_cal();
		r.displayResult();
	}

}
