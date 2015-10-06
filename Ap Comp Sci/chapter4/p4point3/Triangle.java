package p4point3;

public class Triangle
{
	private double[] points = new double[6];
	private int navigator = 0;
	
	/**
	 * Initializes a triangle
	 */
	public Triangle()
	{

	}
	
	/**
	 * Initializes a triangle with the given points
	 * @param x1 x coordinate of the first point
	 * @param y1 y coordinate of the first point
	 * @param x2 x coordinate of the second point
	 * @param y2 y coordinate of the second point
	 * @param x3 x coordinate of the third point
	 * @param y3 y coordinate of the third point
	 */
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		points[0] = x1;
		points[1] = y1;
		points[2] = x2;
		points[3] = y2;
		points[4] = x3;
		points[5] = y3;
		navigator = 6;
	}
	
	/**
	 * Returns the side lengths of the triangle
	 * @return an array of the side lengths
	 */
	public double[] getSideLengths()
	{	
		double dx;
		double dy;
		double[] len = new double[3];
		
		if (navigator != 6)
		{
			System.out.println("Not enough points");
		}
		else
		{
			dx = points[0] - points[2];
			dy = points[1] - points[3];
			len[0] = getLen(dx, dy);
			
			dx = points[2] - points[4];
			dy = points[3] - points[5];
			len[1] = getLen(dx, dy);
			
			dx = points[4] - points[0];
			dy = points[5] - points[1];
			len[2] = getLen(dx, dy);
			
		}
		return len;
	}
	
	/**
	 * Returns the perimeter of the triangle
	 * @return perimeter of the triangle
	 */
	public double getPerimeter()
	{
		double n = 0;
		double[] lengths = new double[3];
		
		if (navigator != 6)
		{
			System.out.println("Not enough points");
		}
		else
		{	
			lengths = getSideLengths();
			for (int i = 0; i < lengths.length; i++)
			{
				n += lengths[i];
			}
		}
		return n;
	}
	
	/**
	 * Adds a point to the triangle
	 * @param x x coordinate of the point
	 * @param y y coordinate of the point
	 */
	public void addPoint(double x, double y)
	{
		if (navigator != 6 && checkPoint(x, y))
		{
			points[navigator] = x;
			points[navigator + 1] = y;
			navigator += 2;
		} 
		else
		{
			System.out.printf("Discarded point: (%.0f, %.0f)", x, y);
		}

	}
	
	/**
	 * Clears all points
	 */
	public void clearPoints()
	{
		for (int i = 0; i < points.length; i++)
		{
			points[i] = 0;
		}
	}

	private boolean checkPoint(double x, double y)
	{
		for (int i = navigator - 1; i > 0; i -= 2)
		{
			if (x == points[i - 1] && y == points[i])
			{
				return false;
			}
		}
		return true;
	}
	
	private double getLen(double dx, double dy)
	{
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
}
