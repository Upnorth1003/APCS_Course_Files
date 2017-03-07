package Module15.Mod15Assignments.Assignment1501;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose
 */
public class MyScience extends Homework
    {
        public MyScience()
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
