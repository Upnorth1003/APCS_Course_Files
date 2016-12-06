package Module08.Mod08Assignments.Car803;


/**
 * Tyler
 * 11/30/2016
 * Program is intended to calculate MPG and the distance.
 */
public class CarV3
    {
        CarV3()
        {

        }

        public int calcDistance(int sMiles, int eMiles)
            {
                return eMiles - sMiles;
            }

        public double calcMPG(int distance, double gallons)
            {
                return distance / gallons;
            }

        public static void printOut(String tofc, int sm, int em, int dis, double gal, double mg)
            {
                System.out.println("\t\t\t\t\tGas Mileage Calculations");
                System.out.printf("%-16s %10s %12s %10s %10s %15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gallon");
                System.out.println("=================================================================================");
                System.out.printf("%-14s %10d %13d %9d %12.2f %12.2f\n", tofc, sm, em, dis, gal, mg);
            }

        public static void main(String[] args)
            {
                CarV3 car1 = new CarV3();

                String typeofCar1 = "02 Ford Taurus";
                int startMiles1 = 148095;
                int endMiles1 = 148225;
                double gallons1 = 10.952;

                int distance = car1.calcDistance(startMiles1, endMiles1);
                double mpg = car1.calcMPG(distance, gallons1);

                car1.printOut(typeofCar1, startMiles1, endMiles1, distance, gallons1, mpg);

            }
    }
