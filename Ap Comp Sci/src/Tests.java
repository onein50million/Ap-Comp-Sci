import java.util.Scanner;

public class Tests
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Test test: ");
		double n = scan.nextDouble();
		System.out.printf("You just typed: %.2f", n);
		scan.close();
	}

}
