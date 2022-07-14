import java.util.Scanner;
class primenumbers{
public static  void main(String args[])
{
int num,i,coef=2;
Scanner so=new Scanner(System.in);
System.out.print("Enter a number:");
num=so.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
{
coef++;
}
}
if(coef==2)
{
System.out.println(num+" is prime numbers");
}
}
}
