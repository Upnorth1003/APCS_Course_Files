package Module13.Mod13Assignments.Polymorphism1303;

import java.util.ArrayList;

/**
 * @author Tyler Spurr
 * @version 2/14/2017
 * @purpose Test and implement classes, use polymorphism.
 */
public class TestPoly2
    {

        public static void getCenter(Circle2 r)
            {
                System.out.println("For " + r + " " + r.center());
                System.out.println();
            }


        public static void main(String[] args)
            {
                Circle2 one = new Circle2(2,4,3);
                Cylinder2 two = new Cylinder2(10, 15, 3, 5);
                Oval2 three = new Oval2(25, 10, 3, 5);
                OvalCylinder2 four = new OvalCylinder2(40,10, 5, 2, 4);

                ArrayList<Circle2> shapes = new ArrayList<Circle2>(5);
                shapes.add(one);
                shapes.add(two);
                shapes.add(three);
                shapes.add(four);

                for (int i = 0; i < shapes.size(); i++)
                    {
                        getCenter(shapes.get(i));
                    }

            }

    }
