package Module08.Mod08Assignments.Car807;

/**
 * Tyler
 * 12/7/2016
 * calculates variables for CarV7Tester.java
 */
public class CarV7
    {
        private String myType;
        private int myStartMiles, myEndMiles, myDistance;
        private double myGallonsUsed, myPricePerGallon, myCost, myGPM, myMPG;


        CarV7()
            {

            }

        CarV7(String typeOfCar, int eMiles, int sMiles, double galUsed, double priceGallon)
            {
                myType = typeOfCar;
                myEndMiles = eMiles;
                myStartMiles = sMiles;
                myGallonsUsed = galUsed;
                myPricePerGallon = priceGallon;
                myDistance = myEndMiles - myStartMiles;
                myCost = myGallonsUsed * myPricePerGallon;
                myGPM = myGallonsUsed / myDistance;
                myMPG = myDistance / myGallonsUsed;
            }


        public void printOut()
            {
                System.out.println("\t\t\t\t\tGas Mileage Calculations");
                System.out.printf("%-16s %10s %12s %10s %10s %9s %11s %17s %14s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gallon", "Gallons/Mile");
                System.out.println("=======================================================================================================================");
                System.out.printf("%-16s %8d %13d %9d %12.2f %10.2f %12.2f %12.2f %14.4f\n", myType, myStartMiles, myEndMiles, myDistance, myGallonsUsed,  myPricePerGallon, myCost, myMPG, myGPM);

            }
        public void printOut2()
            {
                System.out.printf("%-16s %8d %13d %9d %12.2f %10.2f %12.2f %12.2f %14.4f\n", myType, myStartMiles, myEndMiles, myDistance, myGallonsUsed,  myPricePerGallon, myCost, myMPG, myGPM);
            }

    }
