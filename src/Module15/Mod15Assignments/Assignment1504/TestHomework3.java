package Module15.Mod15Assignments.Assignment1504;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose Use the Comparable<T> method
 */
public class TestHomework3
    {

        public static void main(String[] args)
            {
                MyMath3 math = new MyMath3();
                MyScience3 science = new MyScience3();
                MyEnglish3 english = new MyEnglish3();
                MyJava3 java = new MyJava3();

                List<Homework3> homework = new ArrayList<>();

                homework.add(math);
                homework.add(science);
                homework.add(english);
                homework.add(java);

                homework.get(0).createAssignment(4);
                homework.get(1).createAssignment(6);
                homework.get(2).createAssignment(4);
                homework.get(3).createAssignment(5);

                for (int i = 0; i < homework.size(); i++)
                        System.out.println(homework.get(i));

                if (math.compareTo(english) == 0)
                    {
                        System.out.println("The homework for math and english are the same number of pages");
                    }else
                    {
                        System.out.println("The homework for math and english are the same number of pages");
                    }

            }

    }
