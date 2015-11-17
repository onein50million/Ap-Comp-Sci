package buttons;

import java.util.Random;
import java.util.Scanner;

public class Tester
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int batteries = r.nextInt(4);
		boolean CAR = r.nextInt(10) == 0 ? true : false;
		boolean FRK = r.nextInt(10) == 0 ? true : false;
		Button b = new Button(batteries, CAR, FRK);
		
		b.newButton();
		
		System.out.println(b.getColor());
		System.out.println(b.getText());
		System.out.println(batteries);
		if (CAR)
		{
			System.out.println("CAR");
		}
		if (FRK)
		{
			System.out.println("FRK");
		}
		
		int answer = scan.nextInt();
		if (answer == 0)
		{
			System.out.println(b.getStrip());
			answer = scan.nextInt();
			if (b.getHold() == true && b.getTime() == answer)
			{
				System.out.println("\nCorrect\n");
			}
			else
			{
				System.out.println("\nIncorrect\n");
			}
		}
		else
		{
			if (!b.getHold())
			{
				System.out.println("\nCorrect\n");
			}
			else
			{
				System.out.println("\nIncorrect\n");
			}
		}
		scan.close();

	}

}
