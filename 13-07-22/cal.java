import java.util.Scanner;
class cal{
public static void main(String args[])
{
int num1,num2,oper;
Scanner amit=new Scanner(System.in);
cal obj=new cal();
System.out.print("Enter the first number");
num1=amit.nextInt();
System.out.print("Enter the second number");
num2=amit.nextInt();
System.out.print("Press 1 for addition \n press 2 for subraction \n press 3 for multiplication \n press 4 for division");
oper=amit.nextInt();
switch(oper)
{
case 1:
obj.addition(num1,num2);
break;
case 2:
obj.subtraction(num1,num2);
break;
case 3:
obj.multiplication(num1,num2);
break;
case 4:
obj.division(num1,num2);
break;
default:
System.out.println("Invalid statement");
}
}
public void addition(int num1,int num2)
{
System.out.println("addition is"+(num1+num2));
}
public void subtraction(int num1,int num2)
{
System.out.println("subraction is"+(num1-num2));
}
public void multiplication(int num1,int num2)
{
System.out.println("multiplication is"+(num1*num2));
}
public void division(int num1,int num2)
{
System.out.println("division is"+(num1/num2));
}
}



