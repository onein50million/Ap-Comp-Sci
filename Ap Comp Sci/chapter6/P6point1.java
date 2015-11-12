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
		
		System.out.println("\nAll odd numbers:");
		
		//Outputs all the odd numbers between a and b inclusive
		for (int i = a % 2 == 1 ? a : a + 1; i <= b; System.out.print(i + " "), i += 2);
		System.out.println("\n\nSum of even numbers:");
		
		//Outputs the sum of all even numbers between a and b inclusive
		for (int i = a % 2 == 0 ? a : a + 1; i <= b; sum += i, i += 2);
		System.out.println(sum + "\n\nAll numbers between 1 and 10 & their squares:");
		
		//Outputs all the numbers and their squares between 1 and 10 inclusive
		for (int i = 1; i <= 10; System.out.printf("%-2d %-3d\n", i, i * i), i++);
		System.out.println("\nSum of all odd number squares:");
		
		//Outputs the sum of the squares of all the odd numbers between a and b inclusive
		for (int i = a % 2 == 1 ? a : a + 1; i <= b; sum2 += i * i, i += 2);
		System.out.println(sum2);
	}

}
