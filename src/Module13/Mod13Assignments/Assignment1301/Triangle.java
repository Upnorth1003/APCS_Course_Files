package Module13.Mod13Assignments.Assignment1301;

/**
 * @author Tyler
 * @version 2/8/2017
 * @purpose gives info about triangle
 */
public class Triangle
    {
        Triangle()
            {}

        private double sideA, sideB, sideC;

        Triangle(double one, double two, double three)
            {
                sideA = one;
                sideB = two;
                sideC = three;
            }

        public double getSideA()
            {
                return sideA;
            }
        public double getSideB()
            {
                return sideB;
            }
        public double getSideC()
            {
                return sideC;
            }

    }
