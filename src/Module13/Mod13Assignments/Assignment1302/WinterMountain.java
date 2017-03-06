package Module13.Mod13Assignments.Assignment1302;

/**
 * @author Tyler
 * @version 2/13/2017
 * @purpose
 */
public class WinterMountain extends Mountain
    {
        private double myTemp;

        public WinterMountain(int length, int width, int mountains, double temp)
            {
                super(length, width, mountains);
                myTemp = temp;
            }

        public double getTemp()
            {
                return myTemp;
            }
    }
