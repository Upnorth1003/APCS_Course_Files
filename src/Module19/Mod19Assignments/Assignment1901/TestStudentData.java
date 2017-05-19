package Module19.Mod19Assignments.Assignment1901;

import Module16.Mod16Assignment.Assignment1605.Student;

/**
 * @author Tyler
 * @version 4/17/2017
 * @purpose
 */
public class TestStudentData
    {

        public static void main(String[] args)
            {
                double[] scores1 = {90, 80, 39, 100, 90, 95.8};
                StudentData emily = new StudentData("Emily", "Reich", scores1);
                System.out.println(emily);

                double[] scores2 = {100, 95, 90, 93.3, 87.6, 97.5};
                StudentData angel = new StudentData("Angel", "Leka", scores2);
                System.out.println(angel);
            }

    }
