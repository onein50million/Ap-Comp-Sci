import java.util.Scanner;

public class p4point6
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String number = scan.nextLine();
		scan.close();
		number = number.replace(" ", "");
		String s1 = number.substring(0, 3);
		String s2 = number.substring(3, 6);
		String s3 = number.substring(6, 10);
		System.out.println("(" + s1 + ") " + s2 + "-" + s3);
	}

}
