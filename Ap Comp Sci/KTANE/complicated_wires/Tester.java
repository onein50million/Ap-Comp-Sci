package complicated_wires;

import java.util.Random;
import java.util.Scanner;

public class Tester
{

	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean answer;
		int batteries = r.nextInt(4);
		boolean pPort = r.nextBoolean();
		int serial = r.nextInt(9) + 1;
		
		ComplicatedWires c = new ComplicatedWires(batteries, pPort, serial);
		
		c.newWires();
		for (int i = 1; i <= 6; i++)
		{
			System.out.println("Wire " + i + ": " + c.getDesign(i));
		}
		System.out.println("\nBatteries: " + batteries);
		System.out.println("Parallel port: " + pPort);
		System.out.println("Serial number: " + serial);
		System.out.println();
		for (int i = 1; i <= 6; i++)
		{
			System.out.print("Wire " + i + ": ");
			answer = scan.nextInt() == 1 ? true : false;
			if (answer == c.getAnswer(i))
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Incorrect");
			}
		}
		scan.close();
	}

}
