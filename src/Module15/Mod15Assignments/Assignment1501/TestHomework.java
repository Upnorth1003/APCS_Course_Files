package Module15.Mod15Assignments.Assignment1501;

import java.util.ArrayList;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose test the My<Subject> classes and use an abstract class
 */
public class TestHomework
    {

        public static void main(String[] args)
            {
                MyMath math = new MyMath();
                MyScience science = new MyScience();
                MyEnglish english = new MyEnglish();
                MyJava java = new MyJava();

                ArrayList<Homework> homework = new ArrayList<>();

                homework.add(math);
                homework.add(science);
                homework.add(english);
                homework.add(java);

                homework.get(0).createAssignment(4);
                homework.get(1).createAssignment(6);
                homework.get(2).createAssignment(10);
                homework.get(3).createAssignment(5);

                for (int i = 0; i < homework.size(); i++)
                    System.out.println(homework.get(i));

            }

    }
