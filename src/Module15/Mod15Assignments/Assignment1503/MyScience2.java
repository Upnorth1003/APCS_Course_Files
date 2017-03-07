package Module15.Mod15Assignments.Assignment1503;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyScience2 extends Homework2
    {
        public MyScience2()
            {

            }

        public void createAssignment(int p)
            {
                typeHomework = "Science";
                pagesRead = p;
            }

        @Override
        public void doReading()
            {
                pagesRead = pagesRead - 3;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }
    }
