package Module15.Mod15Assignments.Assignment1503;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyJava2 extends Homework2
    {

        public MyJava2()
            {

            }

        @Override
        public void createAssignment(int p)
            {
                pagesRead = p;
                typeHomework = "Java";
            }

        @Override
        public void doReading()
            {
                pagesRead = pagesRead - 4;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }

    }
