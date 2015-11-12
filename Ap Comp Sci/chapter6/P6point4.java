import java.util.Scanner;


public class P6point4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input length: ");
		int length = scan.nextInt();
		scan.close();
		
		Tables();
		System.out.println();
		Stars(length);
		
	}
	
	public static void Tables()
	{
		for (int i = 1; i <=10; i++)
		{
			for (int n = 1; n <= 10; n++)
			{
				System.out.printf("%3d ", i * n);
			}
			System.out.println();
		}
	}
	
	public static void Stars(int length)
	{
		for (int i = 0; i < length; i++)
		{
			for (int n = 0; n < length; n++)
			{
				System.out.print("*");
			}
			System.out.print(" *");
			for (int n = 2; n < length; n++)
			{
				if (i == 0 || i == length - 1)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.print("*\n");
		}
	}

}
