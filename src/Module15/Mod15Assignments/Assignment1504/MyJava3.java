package Module15.Mod15Assignments.Assignment1504;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyJava3 extends Homework3
    {

        public MyJava3()
            {

            }

        @Override
        public void createAssignment(int p)
            {
                pagesRead = p;
                typeHomework = "Java";
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }

    }
