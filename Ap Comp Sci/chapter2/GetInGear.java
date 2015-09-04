
public class GetInGear
{

	public static void main(String[] args)
	{
		String gearString = "12T3T12T6T5T";
		int[] gears = parseGears(gearString);
		System.out.println(getSpins(gears));
		System.out.println(getDirection(gears));
	}
	
	public static long getSpins(int[] gears)
	{
		double spins = 10;
		for (int i = 0; i < gears.length - 1; i++)
		{
			spins = spins * ((double) gears[i] / gears[i + 1]);
		}
		return Math.round(spins);
	}
	
	public static String getDirection(int[] gears)
	{
		String letter;
		if (gears.length % 2 == 0)
		{
			letter = "A";
		}
		else
		{
			letter = "C";
		}
		return letter;
	}
	
	public static int[] parseGears(String gears)
	{
		String[] array = gears.split("T");
		int[] numbers = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			numbers[i] = Integer.parseInt(array[i]);
		}
		return numbers;
	}

}
