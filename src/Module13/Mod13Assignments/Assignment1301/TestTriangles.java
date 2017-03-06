package Module13.Mod13Assignments.Assignment1301;

/**
 * @author Tyler
 * @version 2/8/2017
 * @purpose Test Triangle classes
 */
public class TestTriangles
    {
        public static void main(String[] args)
            {

                Triangle one = new Triangle(4.0, 5.0, 6.0);
                Equilateral two = new Equilateral(5.0);
                IsoscelesRight three = new IsoscelesRight(1.5);

                System.out.println("Triangle has sides A = " + one.getSideA() + ", B = " + one.getSideB() + ", C = " + one.getSideC());
                System.out.println("Equilateral Triangle has sides A = " + two.getSideA() + ", B = " + two.getSideB() + ", C = " + two.getSideC());
                System.out.println("Isosceles Right Triangle has sides A = " + three.getSideA() + ", B = " + three.getSideB() + ", C = " + three.getSideC());


            }
    }
