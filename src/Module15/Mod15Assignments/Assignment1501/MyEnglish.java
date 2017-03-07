package Module15.Mod15Assignments.Assignment1501;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose
 */
public class MyEnglish extends Homework
    {

        public MyEnglish()
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
