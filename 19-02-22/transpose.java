import java.util.*;
class transpose
{
	public static void main(String args[])
	{
	int i,j;
	Scanner so=new Scanner(System.in);
	System.out.println("enter the total rows and columns:");
	int row=so.nextInt();
	int column=so.nextInt();
	int array[][]=new int[row][column];
	System.out.println("Enter matrix:");
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
		{
			array[i][j]=so.nextInt();
			System.out.print("");
		}
	}
	System.out.println(" the above matrix before transpose is ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
		System.out.print(array[i][j]+ " ");
		}
		System.out.println(" ");
	}
		System.out.println("Transpose of matrix");
		for(i=0;i<column;i++)
		{
		for(j=0;j<row;j++)
			{
			System.out.print(array[j][i]+" ");
  
			}
			System.out.println(" ");
		}
}
}