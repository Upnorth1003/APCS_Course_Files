package Module15.Mod15Assignments.Assignment1503;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyMath2 extends Homework2
    {
        public MyMath2()
            {

            }

        public void createAssignment(int p)
            {
                pagesRead = p;
                typeHomework = "Math";
            }

        @Override
        public void doReading()
            {
                pagesRead = pagesRead - 2;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }
    }
