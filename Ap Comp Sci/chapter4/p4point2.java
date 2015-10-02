import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class p4point2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		scan.close();
		SimpleDateFormat date = new SimpleDateFormat("MMMM dd");
		String day = date.format(Easter(year));
		String s = IsWas(year);
		System.out.println("Easter Sunday " + s + " on " + day + " in the year " + year);
	}
	
	public static Date Easter(int y)
	{
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		GregorianCalendar cal = new GregorianCalendar(y, n - 1, p);
		return cal.getTime();
		
	}
	
	public static String IsWas(int year)
	{
		String s;
		if (year > 2015)
		{
			s = "is";
		}
		else
		{
			s = "was";
		}
		return s;
	}

}
