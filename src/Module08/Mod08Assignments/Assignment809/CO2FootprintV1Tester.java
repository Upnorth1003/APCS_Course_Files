package Module08.Mod08Assignments.Assignment809;

/**
 * Tests the Co2FootprintV1 class
 *
 * creates an object and calls the methods for print out. Class is mainly to
 * show knowledge of the use of java docs.
 *
 * @author Tyler
 * @version 12/13/2016
 */
public class CO2FootprintV1Tester
    {

        public static void main(String[] args)
            {
                //The creation of the object taurus from the class Co2FootprintV1
                CO2FootprintV1 taurus = new CO2FootprintV1(566.79);

                //Print out of all the work done
                System.out.println("\t\t CO2 Emissions");
                System.out.printf("%-9s %s %8s\n", "Gallons", "Pounds", "Tons");
                System.out.printf("%-8s %s %9s\n", "of Gas", "from Gas", "from Gas");
                System.out.println("===========================");
                System.out.printf("%3.1f %10.1f %7.1f", taurus.getGas(), taurus.convertToPounds(), taurus.getEmission());
            }

    }
