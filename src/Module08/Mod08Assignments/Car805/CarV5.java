package Module08.Mod08Assignments.Car805;

/**
 * Tyler
 * 12/6/2016
 * Same thing as CarV3 but using different methods of declaring variables.
 */
public class CarV5
    {

        String myType;
        int myStartMiles, myEndMiles;
        double myGallonsUsed, myPricePerGallon;


        CarV5()
            {

            }

        CarV5(String typeOfCar, int eMiles, int sMiles, double galUsed, double priceGallon)
            {
                myType = typeOfCar;
                myEndMiles = eMiles;
                myStartMiles = sMiles;
                myGallonsUsed = galUsed;
                myPricePerGallon = priceGallon;
            }

        public double calcGPM(int dist)
            {
                return myGallonsUsed / dist;
            }

        public double totalCost()
            {
                return myGallonsUsed * myPricePerGallon;
            }


        public int calcDistance()
            {
                return myEndMiles - myStartMiles;
            }

        public double calcMPG(int distance, double gallons)
            {
                return distance / gallons;
            }

        public static void printOut(String tofc, int sm, int em, int dis, double gal, double mg, double gm, double ppg, double cost)
            {
                System.out.println("\t\t\t\t\tGas Mileage Calculations");
                System.out.printf("%-16s %10s %12s %10s %10s %9s %11s %17s %14s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gallon", "Gallons/Mile");
                System.out.println("=======================================================================================================================");
                System.out.printf("%-14s %10d %13d %9d %12.2f %10.2f %12.2f %12.2f %14.4f\n", tofc, sm, em, dis, gal,  ppg, cost, mg, gm);
            }

        public static void main(String[] args)
            {

                String typeofCar1 = "02 Ford Taurus";
                int startMiles1 = 148095;
                int endMiles1 = 148225;
                double gallons1 = 10.952;
                double pricePerGallon1 = 1.839;

                CarV5 car1 = new CarV5(typeofCar1, endMiles1, startMiles1, gallons1, pricePerGallon1);

                int distance1 = car1.calcDistance();
                double mpg1 = car1.calcMPG(distance1, gallons1);
                double gpm1 = car1.calcGPM(distance1);
                double cost1 = car1.totalCost();


                car1.printOut(typeofCar1, startMiles1, endMiles1, distance1, gallons1, mpg1, gpm1, pricePerGallon1, cost1);

            }

    }
