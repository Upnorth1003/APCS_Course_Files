package Module15.Mod15Assignments.Assignment1504;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public class MyEnglish3 extends  Homework3
    {

        public MyEnglish3()
            {

            }

        @Override
        public void createAssignment(int p)
            {
                typeHomework = "English";
                pagesRead = p;
            }

        public String toString()
            {
                return typeHomework + " - must read " + pagesRead + " pages";
            }

    }
