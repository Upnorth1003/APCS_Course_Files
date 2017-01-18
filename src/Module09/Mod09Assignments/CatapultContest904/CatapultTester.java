package Module09.Mod09Assignments.CatapultContest904;

/**
 * @author Tyler
 * @version 1/9/2017
 * @purpose Calculate the range of a projectile with different degrees and velocities
 */
public class CatapultTester
    {

        public static void main(String[] args)
            {

                Double[][] projectile = {
                        {0.0, 25.0, 30.0, 35.0, 40.0, 45.0},
                        {20.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {25.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {30.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {35.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {40.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {45.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {50.0, 0.0, 0.0, 0.0, 0.0, 0.0}};

                for (int row = 1; row < 7; row++)
                    {
                        for (int coloum = 1; coloum < 6; coloum++)
                            {
                                projectile[row][coloum] = Catapult.calcDistance(projectile[row][0], projectile[0][coloum]);
                            }
                    }

                System.out.println("\t\t\t\tProjectile Distance (feet)");
                System.out.println("Mph\t\t  25 deg\t30 deg\t  35 deg\t40 deg\t  50 deg");
                System.out.println("==============================================================");
                Catapult.printOut(projectile);

            }

    }
