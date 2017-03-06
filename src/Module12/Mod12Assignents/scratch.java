package Module12.Mod12Assignents;

import java.util.ArrayList;

/**
 * @author Tyler
 * @version 2/1/2017
 * @purpose
 */
public class scratch
    {

        private static final int BASE = 2;
        public static double calcTriangleArea(int height)
            {
                double area = .5 * BASE * height;
                return area;
            }


        public static void main(String[] args)
            {

                System.out.println(calcTriangleArea(14));
            }

    }
