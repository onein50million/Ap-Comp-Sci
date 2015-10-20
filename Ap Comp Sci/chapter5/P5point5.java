import java.util.Scanner;

public class P5point5
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input year: ");
		int year = scan.nextInt();
		scan.close();
		boolean ans = false;
		if ((year % 4 == 0) & !(year % 100 == 0) || (year % 400 == 0))
		{
			ans = true;
		}
		if (ans)
		{
			System.out.println(year + " is a leap year");
		} else
		{
			System.out.println(year + " is not a leap year");
		}
	}

}
