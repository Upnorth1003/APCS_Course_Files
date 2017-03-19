package Module16.Mod16Assignment.Assignment1602;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose
 */
public class Candidate3
    {

        private String name;
        private int numVotes;

        Candidate3(String name, int numVotes)
            {
                this.name = name;
                this.numVotes = numVotes;
            }

        public String getName()
            {
                return name;
            }

        public int getNumVotes()
            {
                return numVotes;
            }

        public void setNumVotes(int n)
            {
                numVotes = n;
            }

        public void setName(String name)
            {
                this.name = name;
            }


        public String toString()
            {
                return name + " got " + numVotes + " number of votes.";
            }

    }
