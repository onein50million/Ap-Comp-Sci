import java.util.Scanner;

public class Tests
{

	public static void main(String[] args)
	{
		int i = 0;
		if (i < 1.5)
		{
			System.out.println("yes");
		}
		Scanner in = new Scanner(System.in);
		int shortWords = 0;
		while (in.hasNext())
		{
			String input = in.next();
			if (input.length() <= 3)
			{
				shortWords++;
			}
		}
		in.close();
		System.out.println(shortWords);
	}
	//1_6 5_2 1_3 9_3
}
