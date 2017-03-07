package Module15.Mod15Assignments.Assignment1504;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyScience3 extends Homework3
    {

        public MyScience3()
            {

            }

        public void createAssignment(int p)
            {
                typeHomework = "Science";
                pagesRead = p;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }

    }
