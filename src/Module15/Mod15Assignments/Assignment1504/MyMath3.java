package Module15.Mod15Assignments.Assignment1504;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyMath3 extends Homework3
    {

        public MyMath3()
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
