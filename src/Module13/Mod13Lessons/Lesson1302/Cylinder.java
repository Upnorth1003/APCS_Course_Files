package Module13.Mod13Lessons.Lesson1302;
/**
 * Cylinder2 class that extends circle
 * 
 * �FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Cylinder extends Circle
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class cylinder
	 */
	public Cylinder(int x, int y, int rad, int h)
	{
		super(x, y, rad);
	    // initialise instance variables
		height = h;
	}

	public int getHeight()
	{
		
		return height;
	}
}
