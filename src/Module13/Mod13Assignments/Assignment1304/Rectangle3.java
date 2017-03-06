package Module13.Mod13Assignments.Assignment1304;

import Module13.Mod13Assignments.Assignment1301.Rectangle;

/**
 * rectangle Demo.
 * 
 * �FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}

	public String toString()
		{
			return "Rectangle - " + length + " X " + width;
		}

	public String equals(Rectangle3 one, Rectangle3 two)
		{
			if (one.equals(two))
				return one + " is same size as " + two;
			else
				return one + " is no the same size as " + two;
		}
	   
}
