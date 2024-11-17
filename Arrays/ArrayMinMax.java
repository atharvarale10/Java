//write java program to accept n values in array and find min,max
import java.util.*;

class Array2
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

		int min,max;

		min=max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		
			if(max<arr[i])
			{
				max=arr[i];
			}

		}

		System.out.println("The min is "+min);
		System.out.println("The max is "+max);

	}	

}
