package simple_wires;

import java.util.LinkedList;
import java.util.Random;

public class SimpleWires
{
	// 0 = yellow, 1 = white, 2 = blue, 3 = black, 4 = red
	final private String[] colors = {"yellow", "white", "blue", "black", "red"};
	
	private Random r = new Random();
	
	private LinkedList<Integer> wires = new LinkedList<Integer>();
	
	private int answer;
	
	private boolean even;
	private int serial;
	
	public String[] getWires()
	{
		String[] vals = new String[wires.size()];
		Object[] o = wires.toArray();
		for (int i = 0; i < wires.size(); i++)
		{
			vals[i] = colors[(int) o[i]];
		}
		return vals;
	}
	
	public int getSerial()
	{
		return serial;
	}
	
	public int getAnswer()
	{
		return answer;
	}
	
	public void newWires()
	{
		int n = r.nextInt(4) + 3;
		newWires(n);
	}
	
	public void newWires(int length)
	{
		wires.clear();
		serial = r.nextInt(10);
		even = serial % 2 == 0 ? true : false;
		for (int i = 0; i < length; i++)
		{
			wires.add(r.nextInt(5));
		}
		answer = parseAnswer(length);
	}
	
	private int parseAnswer(int length)
	{
		int a = 0;
		if (length == 3)
		{
			if (noColor(4))
			{
				a = 2;
			}
			else if (wires.getLast() == 1)
			{
				a = length;
			}
			else if (moreThanOne(2))
			{
				a = wires.get(0) == 2 && wires.get(1) == 2 ? 2 : 3;
			}
			else
			{
				a = length;
			}
		}
		else if (length == 4)
		{
			if (moreThanOne(4) && !even)
			{
				if (wires.get(0) == 4 && wires.get(1) == 4)
				{
					a = 2;
				}
				else if ((wires.get(0) == 4 && wires.get(2) == 4) || (wires.get(1) == 4 && wires.get(2) == 4))
				{
					a = 3;
				}
				else
				{
					a = 4;
				}
			}
			else if (wires.getLast() == 0 && noColor(4))
			{
				a = 1;
			}
			else if (exactlyOne(2))
			{
				a = 1;
			}
			else if (moreThanOne(0))
			{
				a = length;
			}
			else
			{
				a = 2;
			}
		}
		else if (length == 5)
		{
			if (wires.getLast() == 3 && !even)
			{
				a = 4;
			}
			else if (exactlyOne(4) && moreThanOne(0))
			{
				a = 1;
			}
			else if (noColor(3))
			{
				a = 2;
			}
			else
			{
				a = 1;
			}
		}
		else
		{
			if (noColor(0) && !even)
			{
				a = 3;
			}
			else if(exactlyOne(0) && moreThanOne(1))
			{
				a = 4;
			}
			else if(noColor(4))
			{
				a = length;
			}
			else
			{
				a = 4;
			}
		}
		return a;
	}
	
	private boolean noColor(int color)
	{
		for (int i: wires)
		{
			if (i == color)
			{
				return false;
			}
		}
		return true;
	}
	
	private boolean moreThanOne(int color)
	{
		int count = 0;
		for (int i: wires)
		{
			if (i == color)
			{
				count++;
			}
		}
		if (count > 1)
		{
			return true;
		}
		return false;
	}
	
	private boolean exactlyOne(int color)
	{
		int count = 0;
		for (int i: wires)
		{
			if (i == color)
			{
				count++;
			}
		}
		if (count == 1)
		{
			return true;
		}
		return false;
	}
}
