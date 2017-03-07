package Module15.Mod15Assignments.Assignment1501;

/**
 * @author Tyler
 * @version 3/6/2017
 * @purpose abstract class for other to build off of
 */
public abstract class Homework
    {
        public int pagesRead;
        public String typeHomework;

        public Homework()
            {
                this.pagesRead = 0;
                this.typeHomework = "none";
            }


        public abstract void createAssignment(int p);

    }
