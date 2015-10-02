package p4point23;

public class P4point23
{

	public static void main(String[] args)
	{
		Balloon b = new Balloon();
		b.addAir(100);
		System.out.printf("The radius is: %.2f cm", b.getRadius());
		System.out.printf("\nThe voulme is: %.2f cm³", b.getVoulme());
		System.out.printf("\nThe surface area is: %.2f cm²", b.getSurfaceArea());
		b.addAir(100);
		System.out.printf("\n\nThe radius is: %.2f cm", b.getRadius());
		System.out.printf("\nThe voulme is: %.2f cm³", b.getVoulme());
		System.out.printf("\nThe surface area is: %.2f cm²", b.getSurfaceArea());
	}

}
