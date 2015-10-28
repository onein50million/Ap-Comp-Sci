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
	
	public void newPassword()
	{
		while (!checkWord())
		{
			this.password = options[r.nextInt(options.length)];
			line1[0] = this.password.substring(0, 1);
			line2[0] = this.password.substring(1, 2);
			line3[0] = this.password.substring(2, 3);
			line4[0] = this.password.substring(3, 4);
			line5[0] = this.password.substring(4, 5);
			generateLetters(line1);
			generateLetters(line2);
			generateLetters(line3);
			generateLetters(line4);
			generateLetters(line5);
		}
	}
	
	public String getLine(int n)
	{
		String s = "     ";
		if (n == 0)
		{
			s = line1[0] + line1[1] + line1[2] + line1[3] + line1[4];
		}
		else if (n == 1)
		{
			s = line2[0] + line2[1] + line2[2] + line2[3] + line2[4];
		}
		else if (n == 2)
		{
			s = line3[0] + line3[1] + line3[2] + line3[3] + line3[4];
		}
		else if (n == 3)
		{
			s = line4[0] + line4[1] + line4[2] + line4[3] + line4[4];
		}
		else if (n == 4)
		{
			s = line5[0] + line5[1] + line5[2] + line5[3] + line5[4];
		}
		return s;
	}
	
	private void generateLetters(String[] line)
	{
		while (!checkLine(line))
		{
			for (int i = 1; i < line.length; i++)
			{
				line[i] = letters[r.nextInt(letters.length)];
			}
		}
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
		if (line1[0].equals(""))
		{
			return false;
		}
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
							for (int i = 0; i < options.length; i++)
							{
								if ((line1[a] + line2[b] + line3[c] + line4[d] + line5[3]).equals(options[i]))
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
