package simple_wires;

public class Tester
{

	public static void main(String[] args)
	{
		SimpleWires w = new SimpleWires();
		w.newWires();
		String[] wires = w.getWires();
		for (String s: wires)
		{
			System.out.println(s);
		}
		System.out.println(w.getAnswer());
	}

}
