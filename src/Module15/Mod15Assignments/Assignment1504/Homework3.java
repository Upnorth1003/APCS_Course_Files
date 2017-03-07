package Module15.Mod15Assignments.Assignment1504;


/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public abstract class Homework3 implements Comparable<Homework3>
    {
        public int pagesRead;
        public String typeHomework;

        public Homework3()
            {
                this.pagesRead = 0;
                this.typeHomework = "none";
            }


        public abstract void createAssignment(int p);

        public int compareTo(Homework3 obj)
            {
                if (pagesRead == obj.pagesRead)
                    return 0;
                else if (pagesRead < obj.pagesRead)
                    return -1;
                else
                    return 1;
            }
    }
