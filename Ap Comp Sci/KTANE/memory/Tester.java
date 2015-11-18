package memory;

import java.util.Scanner;

public class Tester
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Memory m = new Memory();
		int answer;
		
		m.Reset();
		do
		{
			System.out.println("   " + m.getDisplay());
			for (int i: m.getSmallDisplay())
			{
				System.out.print(i + " ");
			}
			System.out.println("\nStage " + m.getStage());
			answer = scan.nextInt();
			if (answer == m.getAnswer())
			{
				System.out.println("\nCorrect\n");
				m.advanceStage();
			}
			else
			{
				System.out.println("\nIncorrect\n");
				m.Reset();
			}
		}
		while (m.getStage() != 6);
		System.out.println("Module diffused");
		scan.close();
	}

}
