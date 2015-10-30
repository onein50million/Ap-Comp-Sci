package passwords;

import java.util.Random;

public class Password
{
	final private String[] options = {
			"about", "after", "again", "below", "could",
			"every", "first", "found", "great", "house",
			"large", "learn", "never", "other", "place",
			"plant", "point", "right", "small", "sound",
			"spell", "still", "study", "their", "there",
			"these", "thing", "think", "three", "water",
			"where", "which", "world", "would", "write"
	};
	final private String[] letters = {
			"a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z"
	};
	
	private String[] line1 = {"", "", "", "", ""};
	private String[] line2 = {"", "", "", "", ""};
	private String[] line3 = {"", "", "", "", ""};
	private String[] line4 = {"", "", "", "", ""};
	private String[] line5 = {"", "", "", "", ""};
	
	private String password;
	private Random r = new Random();
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void newPassword()
	{
		do
		{
			this.password = options[r.nextInt(options.length)];
			line1[0] = this.password.substring(0, 1);
			line2[0] = this.password.substring(1, 2);
			line3[0] = this.password.substring(2, 3);
			line4[0] = this.password.substring(3, 4);
			line5[0] = this.password.substring(4, 5);
			line1 = generateLetters(line1);
			line2 = generateLetters(line2);
			line3 = generateLetters(line3);
			line4 = generateLetters(line4);
			line5 = generateLetters(line5);
		}
		while (!checkWord());
	}
	
	public String getLine(int n)
	{
		String[] s = {" ", " ", " ", " ", " "};
		if (n == 0)
		{
			s = line1;;
		}
		else if (n == 1)
		{
			s = line2;
		}
		else if (n == 2)
		{
			s = line3;
		}
		else if (n == 3)
		{
			s = line4;
		}
		else if (n == 4)
		{
			s = line5;
		}
		return shuffleLine(s);
	}
	
	private String shuffleLine(String[] line)
	{
		int[] fill = {0, 0, 0, 0, 0};
		String s = "";
		int n;
		while (!done(fill))
		{
			n = r.nextInt(line.length);
			if (fill[n] != 1)
			{
				fill[n] = 1;
				s += line[n];
			}
		}
		return s;
	}
	
	private boolean done(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != 1)
			{
				return false;
			}
		}
		return true;
	}
	
	private String[] generateLetters(String[] line)
	{
		while (!checkLine(line))
		{
			for (int i = 1; i < line.length; i++)
			{
				line[i] = letters[r.nextInt(letters.length)];
			}
		}
		return line;
	}
	
	private boolean checkLine(String[] line)
	{
		for (int i = 0; i < line.length; i++)
		{
			for (int n = 1; i + n < line.length; n++)
			{
				if (line[i].equals(line[i + n]))
				{
					return false;
				}
			}
				
		}
		return true;
	}
	
	private boolean checkWord()
	{
		for (int a = 0; a < line1.length; a++)
		{
			for (int b = 0; b < line2.length; b++)
			{
				for (int c = 0; c < line3.length; c++)
				{
					for (int d = 0; d < line4.length; d++)
					{
						for (int e = 0; e < line5.length; e++)
						{
							String test = line1[a] + line2[b] + line3[c] + line4[d] + line5[e];
							for (int i = 0; i < options.length; i++)
							{
								if (test.equals(options[i]) && !test.equals(this.password))
								{
									return false;
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
}
