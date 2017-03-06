package Module08.Mod08Assignments.Assignment809;

/**
 *
 *
 * @author Tyler
 * @version 12/13/2016
 */
public class CO2FootprintV1
    {
        private double gallonsOfGas;

        CO2FootprintV1()
            {

            }
        /**
         *@param gallonsOfGas is the amount of gas the car uses within a year.
         */
        CO2FootprintV1(double gallonsOfGas)
            {
                this.gallonsOfGas = gallonsOfGas;
            }

        /**
         * @return the emission the car produces per year
         */
        public double getEmission()
            {
                return this.gallonsOfGas * 8.78E-3;
            }

        /**
         * @return the emission the car produces per year (in pounds)
         */
        public double convertToPounds()
            {
                return this.gallonsOfGas * 8.78E-3 * 2000;
            }

        /**
         * @return the amount of gas used
         */
        public double getGas()
            {
                return this.gallonsOfGas;
            }

    }
