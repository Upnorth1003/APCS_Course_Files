package Module15.Mod15Assignments.Assignment1501;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose
 */
public class MyJava extends Homework
    {
        public MyJava()
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
