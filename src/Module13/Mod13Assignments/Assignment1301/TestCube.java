package Module13.Mod13Assignments.Assignment1301;

/**
 * @author Tyler
 * @version 2/8/2017
 * @purpose tests the cube class with box and rectangle
 */
public class TestCube
    {
        public static void main(String[] args)
            {
                Rectangle one = new Rectangle(2, 4);
                Cube cube = new Cube(4);

                System.out.println("One's dimensions are " + one.getLength() + " X " + one.getWidth());
                System.out.println("Cube's dimensions are " + cube.getWidth() + " X " + cube.getLength() + " X " + cube.getHeight());
            }
    }
