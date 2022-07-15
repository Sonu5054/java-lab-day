import java.util.*;
class maxinarray
{

public static void main(String args[])
{
	Scanner so=new Scanner(System.in); 
	System.out.println("Enter the length of an array"); 
	int len=so.nextInt(); 
	int arr[]=new int[len]; 
	System.out.println("Enter the "+len+" elements");
		
	for(int i=0;i<len;i++) 
	{
	arr[i]=so.nextInt();
	}
	
	int max=arr[4];
	for(int j=0;j<len;j++)
	{
		if(max<arr[j]) 
		{	
		max=arr[j]; 
		}
	}
	System.out.println("The maximum value of array is "+max);
}
}