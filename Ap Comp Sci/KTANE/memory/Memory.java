package memory;

import java.util.Random;

public class Memory
{
	Random r = new Random();
	
	int pos1;
	int num1;
	int pos2;
	int num2;
	int pos3;
	int num3;
	int pos4;
	int num4;
	
	int stage = 0;
	int display = 0;
	int[] smallDisplay = {0, 0, 0, 0};
	
	public void Reset()
	{
		stage = 1;
		generateDisplay();
	}
	
	public void advanceStage()
	{
		stage++;
		generateDisplay();
	}
	
	public int[] getSmallDisplay()
	{
		return smallDisplay;
	}
	
	public int getDisplay()
	{
		return display;
	}
	
	public int getStage()
	{
		return stage;
	}
	
	public int getAnswer()
	{
		int a = 0;
		if (stage == 1)
		{
			if (display == 1)
			{
				a = 2;
			}
			else if (display == 2)
			{
				a = 2;
			}
			else if (display == 3)
			{
				a = 3;
			}
			else
			{
				a = 4;
			}
			pos1 = a;
			num1 = smallDisplay[a - 1];
		}
		else if (stage == 2)
		{
			if (display == 1)
			{
				a = positionOf(smallDisplay, 4);
				num2 = 4;
			}
			else if (display == 2)
			{
				a = pos1;
				num2 = smallDisplay[pos1 - 1];
			}
			else if (display == 3)
			{
				a = 1;
				num2 = smallDisplay[1 - 1];
			}
			else
			{
				a = pos1;
				num2 = smallDisplay[pos1 - 1];
			}
			pos2 = a;
		}
		else if (stage == 3)
		{
			if (display == 1)
			{
				a = positionOf(smallDisplay, num2);
				num3 = num2;
			}
			else if (display == 2)
			{
				a = positionOf(smallDisplay, num1);
				num3 = num1;
			}
			else if (display == 3)
			{
				a = 3;
				num3 = smallDisplay[3 - 1];
			}
			else
			{
				a = positionOf(smallDisplay, 4);
				num3 = 4;
			}
			pos3 = a;
		}
		else if (stage == 4)
		{
			if (display == 1)
			{
				a = pos1;
				num4 = smallDisplay[pos1 - 1];
			}
			else if (display == 2)
			{
				a = 1;
				num4 = 1;
			}
			else if (display == 3)
			{
				a = pos2;
				num4 = smallDisplay[pos2 - 1];
			}
			else
			{
				a = pos2;
				num4 = smallDisplay[pos2 - 1];
			}
			pos4 = a;
		}
		else if (stage == 5)
		{
			if (display == 1)
			{
				a = positionOf(smallDisplay, num1);
			}
			else if (display == 2)
			{
				a = positionOf(smallDisplay, num2);
			}
			else if (display == 3)
			{
				a = positionOf(smallDisplay, num4);
			}
			else
			{
				a = positionOf(smallDisplay, num3);
			}
		}
		return a;
	}
	
	private void generateDisplay()
	{
		display = r.nextInt(4) + 1;
		do
		{
			for (int i = 0; i < 4; i++)
			{
				smallDisplay[i] = r.nextInt(4) + 1;
			}
		}
		while (checkSame(smallDisplay));
	}
	
	private boolean checkSame(int[] a)
	{
		for (int i = 0; i < 4; i++)
		{
			for (int n = 1; i + n < 4; n++)
			{
				if (a[i] == a[i + n])
				{
					return true;
				}
			}
				
		}
		return false;
	}
	
	private int positionOf(int[] array, int n)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == n)
			{
				return i + 1;
			}
		}
		return 0;
	}
}
