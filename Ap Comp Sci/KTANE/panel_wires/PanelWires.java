package panel_wires;

import java.util.Random;

public class PanelWires
{
	//1 = red, 2 = blue, 3 = black
	//1 = A, 2 = B, 3 = C
	//0 = a, 1 = b, 2 = c, 3 = ab, 4 = ac, 5 = bc, 6 = abc
	
	private int nRed;
	private int nBlue;
	private int nBlack;
	
	private int[] redCuts = {2, 1, 0, 4, 1, 4, 6, 3, 1};
	private int[] blueCuts = {1, 4, 1, 0, 1, 5, 2, 4, 0};
	private int[] blackCuts = {6, 4, 1, 4, 1, 5, 3, 2, 2};
	
	private Random r = new Random();
	
	
	public boolean getAnswer(int color, int letter)
	{
		if (color == 1)
		{
			return Parse(redCuts[nRed], letter);
		}
		else if (color == 2)
		{
			return Parse(blueCuts[nBlue], letter);
		}
		else
		{
			return Parse(blackCuts[nBlack], letter);
		}
	}
	
	public void newWires()
	{
		
	}
	
	private boolean Parse(int answer, int letter)
	{
		if (letter == 1)
		{
			return answer == 0 || answer == 3 || answer == 4 || answer == 6;
		}
		else if (letter == 2)
		{
			return answer == 1 || answer == 3 || answer == 5 || answer == 6;
		}
		else
		{
			return answer == 2 || answer == 4 || answer == 5 || answer == 6;
		}
	}
}
