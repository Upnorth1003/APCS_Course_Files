package Module13.Mod13Assignments.Assignment1301;

/**
 * @author Tyler
 * @version 2/8/2017
 * @purpose extend the triangle class and calculate sides with one double input
 */
public class IsoscelesRight extends Triangle
    {
        IsoscelesRight(double sides)
            {
                super(sides, sides, sides * Math.sqrt(2));
            }
    }
