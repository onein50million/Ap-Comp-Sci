package complicated_wires;

import java.util.Random;

public class ComplicatedWires
{
	//0 == cut, 1 == don't cut, 2 == even, 3 == parallel, 4 == batteries
	//0 == red, 1 == blue, 2 == star, 3 == led
	boolean even;
	boolean pPort;
	boolean batteries;
	
	Random r = new Random();
	
	boolean[] answers = new boolean[6];
	boolean[] wire1 = new boolean[4];
	boolean[] wire2 = new boolean[4];
	boolean[] wire3 = new boolean[4];
	boolean[] wire4 = new boolean[4];
	boolean[] wire5 = new boolean[4];
	boolean[] wire6 = new boolean[4];
	
	
	public ComplicatedWires(int nBatteries, boolean parallelPort, int serialNumber)
	{
		even = serialNumber % 2 == 0 ? true : false;
		pPort = parallelPort;
		batteries = nBatteries >= 2 ? true : false;
	}
	
	public boolean getAnswer(int wireNumber)
	{
		return answers[wireNumber - 1];
	}
	
	public String getDesign(int wireNumber)
	{
		String design = "";
		boolean[] wire = new boolean[4];
		if (wireNumber == 1)
		{
			wire = wire1;
		}
		else if (wireNumber == 2)
		{
			wire = wire2;
		}
		else if (wireNumber == 3)
		{
			wire = wire3;
		}
		else if (wireNumber == 4)
		{
			wire = wire4;
		}
		else if (wireNumber == 5)
		{
			wire = wire5;
		}
		else if (wireNumber == 6)
		{
			wire = wire6;
		}
		if (wire[0])
		{
			design += "Red ";
		}
		if (wire[1])
		{
			design += "Blue ";
		}
		if (wire[2])
		{
			design += "Star ";
		}
		if (wire[3])
		{
			design += "Led ";
		}
		if (design.equals(""))
		{
			design = "Nothing";
		}
		return design;
	}
	
	public void newWires()
	{
		do
		{
			wire1 = generateWire();
			wire2 = generateWire();
			wire3 = generateWire();
			wire4 = generateWire();
			wire5 = generateWire();
			wire6 = generateWire();
			
			answers[0] = Solve(wire1);
			answers[1] = Solve(wire2);
			answers[2] = Solve(wire3);
			answers[3] = Solve(wire4);
			answers[4] = Solve(wire5);
			answers[5] = Solve(wire6);
		}
		while (allDontCut());
	}
	
	private boolean[] generateWire()
	{
		boolean[] wire = new boolean[4];
		for (int i = 0; i < 4; i++)
		{
			wire[i] = r.nextBoolean();
		}
		return wire;
	}
	
	private boolean Solve(boolean[] wire)
	{
		if (wire[0])
		{
			if(wire[1])
			{
				if(wire[2])
				{
					if(wire[3])
					{
						//red blue star led
						return false;
					}
					else
					{
						//red blue star
						return pPort;
					}
				}
				else
				{
					if(wire[3])
					{
						//red blue led
						return even;
					}
					else
					{
						//red blue
						return even;
					}
				}
			}
			else
			{
				if(wire[2])
				{
					if(wire[3])
					{
						//red star led
						return batteries;
					}
					else
					{
						//red star
						return true;
					}
				}
				else
				{
					if(wire[3])
					{
						//red led
						return batteries;
					}
					else
					{
						//red
						return even;
					}
				}
			}
		}
		else
		{
			if(wire[1])
			{
				if(wire[2])
				{
					if(wire[3])
					{
						//blue star led
						return pPort;
					}
					else
					{
						//blue star
						return false;
					}
				}
				else
				{
					if(wire[3])
					{
						//blue led
						return pPort;
					}
					else
					{
						//blue
						return even;
					}
				}
			}
			else
			{
				if(wire[2])
				{
					if(wire[3])
					{
						//star led
						return batteries;
					}
					else
					{
						//star
						return true;
					}
				}
				else
				{
					if(wire[3])
					{
						//led
						return false;
					}
					else
					{
						//
						return true;
					}
				}
			}
		}
	}
	private boolean allDontCut()
	{
		for (boolean b: answers)
		{
			if (b)
			{
				return false;
			}
		}
		return true;
	}
}
