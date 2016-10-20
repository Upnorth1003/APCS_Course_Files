

import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/18/16
 */
public class PopulationRatio
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);
                int counter = 0;
                int men = 0;
                int women = 0;

                System.out.print("Enter the population: ");
                int population = in.nextInt();

                while (counter <= population)
                {
                    double rand = Math.random();
                    System.out.print(counter + "\t" + rand);

                    if (rand <= 0.4928231590706602)
                    {
                        men++;
                        System.out.println("\t man");
                    }
                    else
                    {
                        women++;
                        System.out.println("\t woman");

                    }
                    counter++;
                }

                System.out.println();
                System.out.println("Number of Men = " + men);
                System.out.println("Number of Women = " + women);

            }

    }
