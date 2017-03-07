package Module15.Mod15Assignments.Assignment1501;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose
 */
public class MyMath extends Homework
    {

        public MyMath()
            {

            }

        public void createAssignment(int p)
            {
                pagesRead = p;
                typeHomework = "Math";
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }
    }
