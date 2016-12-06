package Module07.Mod07Assignments.CallengeProgram706;


import java.util.Scanner;

/**
 * Tyler
 * 11/20/2016
 */
public class Darts
    {

        public static double[] getTrials(int darts)
            {
                double[] trials = new double[10];
                int sum = 0;

                for (int i = 0; i < trials.length; i++)
                    {

                        for (int s = 0; s <= darts; s++)
                            {
                                double x = Math.random();
                                double y = Math.random();

                                if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
                                    {
                                        sum++;
                                    }

                            }

                        double estimatePi = 4 * (double)sum / (double)darts;
                        trials[i] = estimatePi;
                        sum = 0;
                    }
                return trials;

            }
        public static void printResults(double[] trials)
            {
                for (int i = 0; i < trials.length; i++)
                        System.out.println("Trial [" + i + "}: pi = " + trials[i]);
                System.out.println("Estimate of Pi = ");
            }

        public static void main(String args[])
            {
                Scanner in = new Scanner(System.in);

                System.out.print("How many darts do you want to shoot? ");
                int darts = in.nextInt();

                double[] trials = getTrials(darts);
                //estimatePi = getEstimate;
                printResults(trials);

            }
    }
