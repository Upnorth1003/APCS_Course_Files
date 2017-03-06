package Module13.Mod13Assignments.Assignment1302;

/**
 * @author Tyler
 * @version 2/13/2017
 * @purpose
 */
public class TestTerrain
    {

        public static void main(String[] args)
            {
                Forest one = new Forest(100 ,200, 100);
                Mountain two = new Mountain(300, 400, 25);
                WinterMountain three = new WinterMountain(500, 600, 15, 10.0);

                System.out.println("Forest " + one.terrainSize() + " and has " + one.getTrees() + " trees.");
                System.out.println("Mountain " + two.terrainSize() + " and has " + two.getMountains() + " mountains.");
                System.out.println("Winter Mountain " + three.terrainSize() + " and has temperature " + three.getTemp() + " and " + three.getMountains() + " mountains.");
            }

    }
