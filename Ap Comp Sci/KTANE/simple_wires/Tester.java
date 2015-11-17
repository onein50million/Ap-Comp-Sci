package simple_wires;

import java.util.Random;
import java.util.Scanner;

public class Tester
{

	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int serial = r.nextInt(10);
		
		SimpleWires w = new SimpleWires(serial);
		w.newWires();
		String[] wires = w.getWires();
		
		for (String s: wires)
		{
			System.out.println(s);
		}
		System.out.println(serial);
		int answer = scan.nextInt();
		if (answer == w.getAnswer())
		{
			System.out.println("\nCorrect\n");
		}
		else
		{
			System.out.println("\nIncorrect\nCorrect answer was " + w.getAnswer());
		}
		scan.close();
	}

}
