package Module13.Mod13Assignments.Assignment1302;

/**
 * @author Tyler
 * @version 2/13/2017
 * @purpose
 */
public class Mountain extends Terrain
    {
        private int myMountains;

        public Mountain(int length, int width, int mountains)
            {
                super(length, width);
                myMountains = mountains;
            }

        public int getMountains()
            {
                return myMountains;
            }
    }
