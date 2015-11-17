package simple_wires;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Tester
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SimpleWires w = new SimpleWires();
		w.newWires();
		String[] wires = w.getWires();
		for (String s: wires)
		{
			System.out.println(s);
		}
		System.out.println(w.getSerial());
		//int answer = Integer.valueOf(JOptionPane.showInputDialog("Enter position to cut"));
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
