import java.util.Scanner;
class greatestofNum{
public static void main(String args[])
{
	Scanner amit=new Scanner(System.in);
	System.out.print("Enter first value:");
	int firstNum=amit.nextInt();
	System.out.print("Enter second value:");
	int secondNum=amit.nextInt();
	if(firstNum>secondNum)
	{
	System.out.println(firstNum+" is greatest");
	}
	else{
	System.out.println(secondNum+"is greatest");
	}
}
}