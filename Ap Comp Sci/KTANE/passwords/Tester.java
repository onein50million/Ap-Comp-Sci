package passwords;

import javax.swing.JOptionPane;

public class Tester
{

	public static void main(String[] args)
	{
		int[] givenLines = {1, 2, 3, 4, 5};
		Password p = new Password();
		String password;
		while (true)
		{
			p.newPassword();
			for (int i : givenLines)
			{
				for (String str : p.getLine(i - 1))
				{
					System.out.print(str);
				}
				System.out.println();
			}
			password = (String) JOptionPane.showInputDialog("Enter password");
			if (password.equals(p.getPassword()))
			{
				System.out.println("\nCorrect\n");
			}
			else
			{
				System.out.println("\nIncorrect, password was " + p.getPassword() + "\n");
			}
		}
	}

}
