
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class P2point7
{

	public static void main(String[] args)
	{
		InTheFuture(100);
		Birthday(1998, Calendar.MARCH, 15);
		BirthFuture(1998, Calendar.MARCH, 15, 10000);
	}

	public static void InTheFuture(int n)
	{
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, n);
		SimpleDateFormat date = new SimpleDateFormat("EEEE MMMM dd YYYY");
		String day = date.format(cal.getTime());
		System.out.println(n + " Days in the future is: " + day);
	}
	
	public static void Birthday(int year, int month, int days)
	{
		GregorianCalendar cal = new GregorianCalendar(year, month, days);
		SimpleDateFormat date = new SimpleDateFormat("EEEE");
		String weekday = date.format(cal.getTime());
		System.out.println("Your birthday was on: " + weekday);
	}
	
	public static void BirthFuture(int year, int month, int days, int n)
	{
		GregorianCalendar cal = new GregorianCalendar(year, month, days);
		cal.add(Calendar.DAY_OF_MONTH, n);
		SimpleDateFormat date = new SimpleDateFormat("MMMM dd YYYY");
		String day = date.format(cal.getTime());
		System.out.println(n + " Days after your birthday is: " + day);
	}

}
