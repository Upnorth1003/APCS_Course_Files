package Module08.Mod08Assignments.ChallengeProgram812;

/**
 * @author Tyler Spuurr
 * @version 12/15/2016
 * @purpose To calculate my personal CO2 waste emissions.
 */
public class CO2Footprint
    {
        private int myLights, myNumOfPeople;
        private double myAGU, myAEB, myAEP, myEmissions, myNetEmissions, myReduction;
        private boolean myRPa, myRPl, myRG, myRC;

        /**
         *
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
         *
         * @return the emission of CO2 from electricity
         */
        public double calcElectricityCO2 ()
            {
                return myAEB / myAEP * 1.37 * 12;
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
         * Mutator method to calculate the net emissions (no paramters)
         */
        public void calcNetWasteReduction()
            {
                myNetEmissions = myEmissions - myReduction;
            }

        /**
         * Getter method to return the total emissions (no paramters)
         */
        public double getEmissions()
            {
                return myEmissions;
            }

        /**
         * Getter method to return the reduction amount (no paramters)
         */
        public double getReduction()
            {
                return myReduction;
            }

        /**
         * Getter method to return the net emissions (no paramters)
         */
        public double getNetEmissions()
            {
                return myNetEmissions;
            }

    }
