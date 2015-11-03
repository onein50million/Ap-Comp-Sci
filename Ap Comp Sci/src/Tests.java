import java.util.Scanner;

public class Tests
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter things: ");
		String i = "";
		while (scan.hasNext())
		{
			i += scan.next();
		}
		System.out.println(i);
		scan.close();
	}
}
