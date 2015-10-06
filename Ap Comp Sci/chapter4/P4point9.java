import java.util.Scanner;

public class P4point9
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter initial balance: ");
		double balance = scan.nextDouble();
		System.out.print("Enter annual interest (in percent): ");
		double interest = scan.nextDouble();
		scan.close();
		System.out.printf("Initial balance: $%.0f", balance);
		System.out.printf("\nAnnual interest: %.0f%%", interest);
		double m1 = balance * (1 + (interest / 100 / 12));
		double m2 = balance * Math.pow(1 + (interest / 100 / 12), 2);
		double m3 = balance * Math.pow(1 + (interest / 100 / 12), 3);
		System.out.printf("\nMonth 1: $%.2f", m1);
		System.out.printf("\nMonth 2: $%.2f", m2);
		System.out.printf("\nMonth 3: $%.2f", m3);
	}

}
