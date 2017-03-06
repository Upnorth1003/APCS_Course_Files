package Module13.Mod13Assignments.Assignment1304;

import Module13.Mod13Assignments.Assignment1301.Rectangle;

/**
 * @author Tyler
 * @version 2/17/2017
 * @purpose Learn overwriting methods
 */
public class TestNew
    {

        public static void showEffectBoth(Rectangle r)
            {
                System.out.println(r);
            }

        public static void main(String[] args)
            {

                Rectangle3 one = new Rectangle3(5, 20);
                Box3 two = new Box3(4,4,4);
                Box3 three = new Box3(4,10,5);
                Cube3 four = new Cube3(4);

                System.out.println(one);
                showEffectBoth(two);
                showEffectBoth(three);
                System.out.println(four);

                if (two.equals(four))
                    {
                        System.out.println(two + " is the same size as " + four);
                    }else
                    {
                        System.out.println("Error");
                    }
                if (!three.equals(four))
                    {
                        System.out.println(three + " is not the same as " + four);
                    }

            }

    }
