package Module07.Mod07Assignments.MathMethods701;

/**
 * Tyler
 * 11/14/2016
 * Calculate the points on a circle with the given radius.
 */
public class PointsOnACircleV1
    {
        public static void main(String[] args)
            {
                double radius = 1;
                double yOne;
                double yTwo;

                System.out.println("    Points on a Circle of Radius 1.0");
                System.out.printf("%6s %8s %12s %6s", "x1", "y1", "x1", "y2");
                System.out.println();
                System.out.println("---------------------------------------");
                for(double i = 1.0; i >= -1.0; i -= .1 )
                    {
                        yOne = Math.sqrt(Math.pow(radius, 2) - Math.pow(i, 2));
                        yTwo = -yOne;

                        if (yTwo == (-0.00))
                            yTwo = yOne;

                        System.out.printf("%7.2f %8.2f %10.2f %8.2f\n", i, Math.abs(yOne), i, yTwo);
                    }
            }
    }
