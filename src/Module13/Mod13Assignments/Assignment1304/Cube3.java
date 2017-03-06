package Module13.Mod13Assignments.Assignment1304;

import Module13.Mod13Assignments.Assignment1301.Box;

/**
 * @author Tyler
 * @version 2/8/2017
 * @purpose calc cube sides with one int input
 */
public class Cube3 extends Box
    {
        public Cube3(int sides)
            {
                super(sides, sides, sides);
            }

        public String toString()
            {
                return "Cube - " + getHeight() + " X " + getLength() + " X " + getWidth();
            }



    }
