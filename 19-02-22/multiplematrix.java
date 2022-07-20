import java.util.*;
class multiplematrix
{
	public static void main(String args[])
{
	int i,j,k,l;
	Scanner so=new Scanner(System.in);
	System.out.println("enter a number of rows");
	int rows=so.nextInt();
	System.out.println("enter a number of coloums");
	int cols=so.nextInt();
	int a[][]=new int[rows][cols];
	int b[][]=new int[rows][cols];
	int c[][]=new int[rows][cols];
	System.out.println("enter the First matrix");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{ 
			a[i][j]=so.nextInt();
		}
	}
		System.out.println("enter the second matrix");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{ 
				b[i][j]=so.nextInt();
			}
		} 
		System.out.println("Multiplication  of matrix");
		for(i=0;i<rows;i++)
		{
		for(j=0;j<cols;j++)
		{  
			c[i][j]=0;
			for(k=0;k<cols;k++)
			c[i][j]+=a[i][k]*b[k][j];
		}
	}
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{ 
				System.out.print(c[i][j]+" ");
			}
				System.out.println("");
		}
}
}

