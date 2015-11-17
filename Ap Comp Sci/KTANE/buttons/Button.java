package buttons;

import java.util.Random;

public class Button
{
	//yellow = 0, white = 1, blue = 2, red = 3
	final private String[] colors = {"Yellow", "White", "Blue", "Red"};
	
	//hold = 0, detonate = 1, abort = 2, press = 3
	final private String[] words = {"Hold", "Detonate", "Abort", "Press"};
	
	Random r = new Random();
	
	private int batteries;
	private boolean CAR;
	private boolean FRK;
	
	private int text;
	private int color;
	
	private boolean hold;
	private int strip;
	
	public Button(int nBatteries, boolean car, boolean frk)
	{
		batteries = nBatteries;
		CAR = car;
		FRK = frk;
	}
	
	public void newButton()
	{
		color = r.nextInt(4);
		text = r.nextInt(4);
		hold = parseAnswer(color, text);
		strip = r.nextInt(4);
	}
	
	private boolean parseAnswer(int color, int text)
	{
		if (color == 2 && text == 2)
		{
			return true;
		}
		else if (batteries > 1 && text == 1)
		{
			return false;
		}
		else if (color == 1 && CAR)
		{
			return true;
		}
		else if (batteries > 2 && FRK)
		{
			return false;
		}
		else if (color == 0)
		{
			return true;
		}
		else if (color == 3 && text == 0)
		{
			return false;
		}
		return true;
	}
	
	public String getText()
	{
		return words[text];
	}
	
	public String getColor()
	{
		return colors[color];
	}
	
	public String getStrip()
	{
		return colors[strip];
	}
	
	public boolean getHold()
	{
		return hold;
	}
	
	public int getTime()
	{
		int a = 1;
		if (strip == 2)
		{
			a = 4;
		}
		else if (strip == 0)
		{
			a = 5;
		}
		return a;
	}
}
