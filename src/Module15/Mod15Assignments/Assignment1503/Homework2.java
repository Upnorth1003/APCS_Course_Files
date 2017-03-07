package Module15.Mod15Assignments.Assignment1503;

/**
 * @author Tyler
 * @version 3/7/2017
 * @purpose
 */
public abstract class Homework2 implements Processing
    {

        public int pagesRead;
        public String typeHomework;

        public Homework2()
            {
                this.pagesRead = 0;
                this.typeHomework = "none";
            }


        public abstract void createAssignment(int p);

    }
