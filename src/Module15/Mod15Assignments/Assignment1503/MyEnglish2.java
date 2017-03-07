package Module15.Mod15Assignments.Assignment1503;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyEnglish2 extends Homework2
    {
        public MyEnglish2()
            {

            }

        @Override
        public void createAssignment(int p)
            {
                typeHomework = "English";
                pagesRead = p;
            }

        @Override
        public void doReading()
            {
                pagesRead = pagesRead - 1;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }
    }
