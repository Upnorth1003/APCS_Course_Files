package Module08.Mod08Assignments.Assignment809;

/**
 *
 *
 * @author Tyler
 * @version 12/13/2016
 */
public class CO2FootprintV1
    {
        private double mygOG;

        CO2FootprintV1()
            {

            }
        /**
         *@param gallonsOfGas is the amount of gas the car uses within a year.
         */
        CO2FootprintV1(double gallonsOfGas)
            {
                mygOG = gallonsOfGas;
            }

        /**
         * @return the emission the car produces per year
         */
        public double getEmission()
            {
                return mygOG * 8.78E-3;
            }

        /**
         * @return the emission the car produces per year (in pounds)
         */
        public double convertToPounds()
            {
                return mygOG * 8.78E-3 * 2000;
            }

        /**
         * @return the amount of gas used
         */
        public double getGas()
            {
                return mygOG;
            }

    }
