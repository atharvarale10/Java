//write java program to accept multiple names in array and sort them in alphabetical //order
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		String str;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many names:");
		int n=sc.nextInt();

		String arr[]=new String[n];
		System.out.println("Enter names one by one:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					str=arr[i];
					arr[i]=arr[j];
					arr[j]=str;
				}

			}
		} 

		System.out.println("The names in alphabetical order are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
