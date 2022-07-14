import java.util.Scanner;
class DisplayevenNumbers
{
public static void main(String args[])
{
int i;
Scanner so=new Scanner(System.in);
System.out.println("Enter the limit");
int limit=so.nextInt();
for(i=1;i<=limit;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}