package passwords;

import javax.swing.JOptionPane;

public class Tester
{

	public static void main(String[] args)
	{
		Password p = new Password();
		String password;
		while (true)
		{
			p.newPassword();
			for (int i = 0; i < 5; i++)
			{
				System.out.println(p.getLine(i));
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
