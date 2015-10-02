package p4point23;

public class Balloon
{
	private double volume;
	private double sArea;
	private double radius;
	
	/**
	 * Constructs a balloon with a specific starting volume
	 * @param volume starting volume
	 */
	public Balloon(double volume)
	{
		this.volume = volume;
	}
	
	/**
	 * Constructs and empty balloon
	 */
	public Balloon()
	{
		this.volume = 0;
	}
	
	/**
	 * Adds to the volume
	 * @param amount amount of air to add in cubic centimeters
	 */
	public void addAir(double amount)
	{
		this.volume += amount;
		updateRadius();
		updateSArea();
	}
	
	private void updateRadius()
	{
		this.radius = Math.cbrt((3d / 4d) / Math.PI * this.volume);
	}
	
	private void updateSArea()
	{
		this.sArea = 4 * Math.PI * Math.pow(this.radius, 2);
	}
	
	/**
	 * Returns the radius
	 * @return radius in centimeters
	 */
	public double getRadius()
	{
		return this.radius;
	}
	
	/**
	 * Returns the surface area
	 * @return surface area in square centimeters
	 */
	public double getSurfaceArea()
	{
		return this.sArea;
	}
	
	/**
	 * Returns the volume
	 * @return volume in cubic centimeters
	 */
	public double getVoulme()
	{
		return this.volume;
	}
}
