//write java program to accept n values in array and search for element
import java.util.*;

class ArraySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[],n;
		System.out.println("enter how many values:");
		n=sc.nextInt();

		arr=new int[n];
		System.out.println("Enter values one by one:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter value to be searched:");
		int ele=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("element found at index "+i);
				break;
			}
		}

		if(i==n)
		{
			System.out.println("Not found");
		}

	}	

}
