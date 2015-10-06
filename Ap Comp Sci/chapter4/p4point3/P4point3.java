package p4point3;

public class P4point3
{

	public static void main(String[] args)
	{
		System.out.println("Triangle 1");
		Test1();
		System.out.println("\n\nTriangle 2");
		Test2();
	}
	
	public static void Test1()
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
	
	public static void Test2()
	{
		double[] lens = new double[3];
		Triangle t = new Triangle(2, 4, -4, 5, 10, 3);
		System.out.printf("Perimeter: %.2f", t.getPerimeter());
		lens = t.getSideLengths();
		System.out.printf("\nSide lengths: %.2f %.2f %.2f", lens[0], lens[1], lens[2]);
	}

}
