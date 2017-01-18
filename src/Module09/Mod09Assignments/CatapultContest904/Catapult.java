package Module09.Mod09Assignments.CatapultContest904;

/**
 * @author Tyler
 * @version 1/9/2017
 * @purpose calculate the range of a projectile
 */
public class Catapult
    {
        Catapult()
            {

            }

        public static double calcDistance(double velocity, double degree)
            {

                return (Math.pow(velocity, 2) * Math.sin(2 * Math.toRadians(degree)) / 9.81);

            }

        public static void printOut(Double[][] array)
            {
                for(int row = 1; row < 7; row ++)
                    {
                        for(int col = 0; col < 6; col ++)
                            {
                                System.out.printf("%-10.2f", array[row][col]);
                            }
                        System.out.println();
                    }

            }
    }
