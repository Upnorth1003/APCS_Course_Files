package Module13.Mod13Assignments.Assignment1304;

import Module13.Mod13Assignments.Assignment1301.Rectangle;

/**
 * box demo.
 * 
 * �FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle
{

	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}

	public String toString()
		{
			return "Box - " + getLength() + " X " + getWidth() + " X " + height;
		}

	public boolean equals(Cube3 o)
		{
				if (!(o instanceof Cube3))
					return false;


				return this.getLength() == o.getLength()
						&& this.getWidth() == o.getWidth()
						&& this.getHeight() == o.getHeight();

		}

}