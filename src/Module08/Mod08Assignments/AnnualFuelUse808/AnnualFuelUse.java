package Module08.Mod08Assignments.AnnualFuelUse808;

/**
 * Tyler
 * 12/11/2016
 * Sub program to call variables and calculate variables within the array.
 */
public class AnnualFuelUse
    {
        private int startMiles, endMiles, totalDistance, distances, days;
        private double pricePerGallon, gallonsUsed, milesPerGallon, cost;

        AnnualFuelUse()
            {

            }

        AnnualFuelUse(int startMiles, int endMiles, double pricePerGallon, double gallonsUsed, int days)
            {
                this.startMiles = startMiles;
                this.endMiles = endMiles;
                this.pricePerGallon = pricePerGallon;
                this.gallonsUsed = gallonsUsed;
                this.distances = endMiles - startMiles;
                this.milesPerGallon = this.distances / this.gallonsUsed;
                this.cost = this.gallonsUsed * this.pricePerGallon;
                this.days = days;
            }

        public int calcDistance()
            {
                return this.endMiles - this.startMiles;
            }

        public int getDays()
            {
                return this.days;
            }

        public double getMPG()
            {
                return this.milesPerGallon;
            }

        public double getPPG()
            {
                return this.pricePerGallon;
            }

        public double getGallons()
            {
                return this.gallonsUsed;
            }

        public double getCost()
            {
                return this.cost;
            }


        public int calcTotalDistance(int maxDist, int minDist)
            {
                this.totalDistance = maxDist - minDist;
                return maxDist - minDist;
            }


        public void printLine(int fillUp)
            {
                System.out.printf("%4d %7d %12d %12d %9d %14.3f %9.2f %7.3f %7.2f\n",
                        fillUp, this.days, this.startMiles, this.endMiles, this.distances, this.gallonsUsed, this.milesPerGallon, this.pricePerGallon, this.cost);
            }


    }
