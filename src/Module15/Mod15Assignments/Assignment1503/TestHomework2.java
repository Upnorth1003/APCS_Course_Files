package Module15.Mod15Assignments.Assignment1503;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose test the My<Subject> classes and use an interface. Also, use List<>
 */
public class TestHomework2
    {

        public static void main(String[] args)
            {
                MyMath2 math = new MyMath2();
                MyScience2 science = new MyScience2();
                MyEnglish2 english = new MyEnglish2();
                MyJava2 java = new MyJava2();

                List<Homework2> homework = new ArrayList<>();

                homework.add(math);
                homework.add(science);
                homework.add(english);
                homework.add(java);

                homework.get(0).createAssignment(4);
                homework.get(1).createAssignment(6);
                homework.get(2).createAssignment(10);
                homework.get(3).createAssignment(5);

                for (int i = 0; i < homework.size(); i++)
                    {
                        System.out.println("Before Reading:");
                        System.out.println(homework.get(i));
                        homework.get(i).doReading();

                        System.out.println("After Reading: ");
                        System.out.println(homework.get(i));


                    }
            }
    }