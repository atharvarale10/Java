//write java program to accept input values in 2 matrices and add them
import java.util.*;

class AddMatrices
{
	public static void main(String args[])
	{
		int arr1[][],arr2[][],arr3[][];
/*
Explanation; When we declare 2d array, we use 2 [][]. We dont mention the no. of rows or no. of columns while declaring 2d array. SO we have kept 2 brackets [] empty in above 2d array arr variable declaration.
*/
		int rows1,cols1,rows2,cols2;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter how many rows and columns in 1st matrix:");
		rows1=sc.nextInt();
		cols1=sc.nextInt();


		System.out.println("Enter how many rows and columns in 2nd matrix:");
		rows2=sc.nextInt();
		cols2=sc.nextInt();

		if((rows1==rows2)&&(cols1==cols2))
		{
		arr1=new int[rows1][cols1];
		arr2=new int[rows2][cols2];
		System.out.println("Enter the elements in matrix1:");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
/*
Explanation: When we access elements in 2d array we write 2 for loops one inside other. They are nested loops. The variable i of outer for loopis used as row index, variable j of inner loop is used as column index. 
In 2d array every element has row index and column index. The counting of row and column index both begins from 0. 

*/		
		System.out.println("Enter the elements in matrix2:");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<cols2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}

		System.out.println("The elements in addition matrix are:");
		arr3=new int[rows1][cols1];
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println();
			//so that every new row is display on new line
			for(int j=0;j<arr3[i].length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
				//so that there is gap of 1 space between 2 //consecutive columns in same row

			}
		}

//arr3.length returns no. of rows in 2d array arr3
//arr3[i].length returns no. of columns in row i

		System.out.println("The elements in addition matrix are:");
		for(int m[]:arr3)
		{
			System.out.println();
			//so that every new row is display on new line
			for(int n:m)
			{
				System.out.print(n+" ");
			}
		}
/*
Explanation: In above for each loop which we have used for 2d array, each time outer for each loop runs a new row of arr3 is automatically accessed and assigned to m variable. The elements or column values in current row assigned to m are displayed in inner for each loop. The inner for each loop is same as for each loop we ssaw for 1d array,

*/
		}

		else
		{
			System.out.println("2 matrices cannot be added");
		}
	}

}