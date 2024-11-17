//write java program to accept n values in array and find min,max
import java.util.*;

class Array3
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

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("The sorted array is:");
		for(int m:arr)
		{
			System.out.print(m+" ");
		}
	}	

}
