import java.util.Scanner;


public class P6point1
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.print("Enter b: ");
		int b = scan.nextInt();
		scan.close();
		int sum = 0;
		int sum2 = 0;
		System.out.println();
		for (int i = a % 2 == 1 ? a : a + 1; i <= b; System.out.println(i), i += 2);
		System.out.println();
		for (int i = a % 2 == 0 ? a : a + 1; i <= b; sum += i, i += 2);
		System.out.println(sum + "\n");
		for (int i = 1; i <= 10; System.out.println(i + " " + Math.round(Math.pow(i, 2))), i++);
		System.out.println();
		for (int i = a % 2 == 1 ? a : a + 1; i <= b; sum2 += Math.round(Math.pow(i, 2)), i += 2);
		System.out.println(sum2);
	}

}
