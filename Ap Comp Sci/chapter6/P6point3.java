import java.util.Scanner;

public class P6point3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		scan.close();
		
		while (true)
		{
			for (int i = 2; i <= Math.round(n / 2); i++)
			{
				if (n % i == 0)
				{
					System.out.println(i);
					n = n / i;
					i = 1;
				}
			}
			System.out.println(n);
			break;
		}
	}


}
