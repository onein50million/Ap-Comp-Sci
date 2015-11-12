import java.util.Scanner;


public class P6point2
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input x: ");
		int x = scan.nextInt();
		System.out.print("Input y: ");
		int y = scan.nextInt();
		scan.close();
		
		while (x != 0 && y != 0)
		{
			if (x > y)
			{
				x -= y;
			}
			else
			{
				y -= x;
			}
		}
		System.out.println("The greatest common divisor is: " + (x == 0 ? y : x));
	}
	
}
