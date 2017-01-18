package Module08.Mod08Assignments.ChallengeProgram812;

/**
 * @author Tyler Spurr
 * @version 12/19/2016
 * @purpose To calculate my personal CO2 waste emissions.
 */
public class CO2Footprint
    {
        private int myLights, myNumOfPeople;
        private double myAGU, myAEB, myAEP, myEmissions, myNetEmissions,
                myReduction, myLightReduction, myElecPolution, myGasPolution;
        private boolean myRPa, myRPl, myRG, myRC;

        /**
         * @param annualGasUsed gass usedwithin a year
         * @param averageElecBill average monthly electricity bill cost
         * @param averageElecPrice average monthly price for electricity
         * @param numOfPeople number of people in family
         * @param recyPaper if you recycle paper
         * @param recyPlastic if you recycle plastic
         * @param recyGlass if you recycle glass
         * @param recyCans if you recycle cans
         * @param lightBulbsReplaced number of ligths changed to non-incandecent
         */
        CO2Footprint(double annualGasUsed, double averageElecBill, double averageElecPrice, int numOfPeople, boolean recyPaper, boolean recyPlastic, boolean recyGlass, boolean recyCans, int lightBulbsReplaced)
            {
                myAGU = annualGasUsed;
                myAEB = averageElecBill;
                myAEP = averageElecPrice;
                myNumOfPeople = numOfPeople;
                myRPa = recyPaper;
                myRPl = recyPlastic;
                myRG = recyGlass;
                myRC = recyCans;
                myLights = lightBulbsReplaced;
            }

        /**
         * @return the energy reduction by replacing a bulb
         */
        public void calcBulbReduction()
            {
                myLightReduction =  myLights * 1.37 * 73;
            }

        /**
         * @return the emission of CO2 from electricity
         */

        public void calcElectricityCO2 ()
            {
                myElecPolution =  myAEB / myAEP * 1.37 * 12;
            }

        /**
         * Mutator method to calculate the total emissions, without any recycling (no parameters)
         */
        public void calcGrossWasteEmission()
            {
                myEmissions = myNumOfPeople * 1018;
            }

        /**
         * Mutator method to calculate the emission reduction from recycling (no parameters)
         */
        public void calcWasteReduction()
            {
                if(myRPa)
                    myReduction += (184.0 * myNumOfPeople);

                if (myRPl)
                    myReduction += (25.6 * myNumOfPeople);

                if (myRG)
                    myReduction += (46.6 * myNumOfPeople);

                if (myRC)
                    myReduction += (165.8 * myNumOfPeople);
            }
        /**
         * @return the emission the car produces per year (in pounds)
         */
        public void polutionFromGas()
            {
                myGasPolution =  myAGU * 8.78E-3 * 2000;
            }

        /**
         * Mutator method to calculate the net emissions (no paramters)
         */
        public void calcNetWasteReduction()
            {
                myNetEmissions = (myEmissions + myGasPolution + myElecPolution) - myReduction;
            }

        /**
         * Method to print out varables
         */
        public void printOut()
            {
                System.out.printf("| %-9.2f |  %10.2f   | %1.2f | %10.2f   |  %8.2f   |  %10.2f     |\n", myGasPolution, myElecPolution,
                        myEmissions, myReduction, myLightReduction, myNetEmissions);
            }

    }
