import javax.swing.JOptionPane;


public class P6point5
{

	public static void main(String[] args)
	{
		do
		{
			String number = "";
			String s = JOptionPane.showInputDialog("Enter telephone number in letters").replace(" ", "");
			s = s.length() > 7 ? s.substring(0, 7) : s;
			for (char c: s.toLowerCase().toCharArray())
			{
				number += String.valueOf(convertLetter(c));
			}
			number = number.substring(0, 3) + "-" + number.substring(3);
			JOptionPane.showMessageDialog(null, "The phone number is: " + number);
		}
		while (JOptionPane.showConfirmDialog(null, "Continue?") == 0);
	}
	
	public static int convertLetter(char c)
	{
		int i;
		if (c == 'a' || c == 'b' || c == 'c')
		{
			i = 2;
		}
		else if (c == 'd' || c == 'e' || c == 'f')
		{
			i = 3;
		}
		else if (c == 'g' || c == 'h' || c == 'i')
		{
			i = 4;
		}
		else if (c == 'j' || c == 'k' || c == 'l')
		{
			i = 5;
		}
		else if (c == 'm' || c == 'n' || c == 'o')
		{
			i = 6;
		}
		else if (c == 'p' || c == 'q' || c == 'r' || c == 's')
		{
			i = 7;
		}
		else if (c == 't' || c == 'u' || c == 'v')
		{
			i = 8;
		}
		else
		{
			i = 9;
		}
		return i;
	}

}
