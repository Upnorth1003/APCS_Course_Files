package Module08.Mod08Assignments.AnnualFuelUse808;

/**
 * Tyler
 * 12/11/2016
 */
public class AnnualFuelUse
    {
        private int mySM, myEM, myTotalDis, myDis, myDay;
        private double myPPG, myGU, myMPG, myCost;

        AnnualFuelUse()
            {

            }

        AnnualFuelUse(int startMiles, int endMiles, double pricePerGallon, double gallonsUsed, int days)
            {
                mySM = startMiles;
                myEM = endMiles;
                myPPG = pricePerGallon;
                myGU = gallonsUsed;
                myDis = endMiles - startMiles;
                myMPG = myDis / myGU;
                myCost = myGU * myPPG;
                myDay = days;
            }

        public int calcDistance()
            {
                return myEM - mySM;
            }

        public int getDays()
            {
                return myDay;
            }

        public double getMPG()
            {
                return myMPG;
            }

        public double getPPG()
            {
                return myPPG;
            }

        public double getGallons()
            {
                return myGU;
            }

        public double getCost()
            {
                return myCost;
            }


        public int calcTotalDistance(int maxDist, int minDist)
            {
                myTotalDis = maxDist - minDist;
                return maxDist - minDist;
            }


        public void printLine(int fillUp)
            {
                System.out.printf("%d %d %d %d %d %f %f %f %f\n", fillUp, myDay, mySM, myEM, myDis, myGU, myMPG, myPPG, myCost);
            }


    }
