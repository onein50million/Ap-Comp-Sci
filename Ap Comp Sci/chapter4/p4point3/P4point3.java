package p4point3;

public class P4point3
{

	public static void main(String[] args)
	{
		double[] lens = new double[3];
		Triangle t = new Triangle();
		t.addPoint(1, 2);
		t.addPoint(6, 3);
		t.addPoint(15, 7);
		System.out.printf("Perimeter: %.2f", t.getPerimeter());
		lens = t.getSideLengths();
		System.out.printf("\nSide lengths: %.2f %.2f %.2f", lens[0], lens[1], lens[2]);
	}

}
