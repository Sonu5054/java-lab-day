import java.util.Scanner;
class password
{
	public static void main(String args[])
	{
		String username;
		int password;
		Scanner so=new Scanner(System.in);
		System.out.print("enter username:");
		username=so.nextLine();
		System.out.print("Enter password:");
		password=so.nextInt();
		System.out.println(password);
		{
		if(password==12345)
		{
			System.out.println(username+"login successfull:");
		}
		else{
			System.out.println(username+"login denied:");
			}
		}
	}
}