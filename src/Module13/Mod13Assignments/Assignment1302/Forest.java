package Module13.Mod13Assignments.Assignment1302;

/**
 * @author Tyler
 * @version 2/13/2017
 * @purpose
 */
public class Forest extends Terrain
    {
        private int myTrees;

        public Forest(int length, int width, int trees)
            {
                super(length, width);
                myTrees = trees;
            }

        public int getTrees()
            {
                return myTrees;
            }

    }
