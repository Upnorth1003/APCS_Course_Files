package Module16.Mod16Assignment.Assignment1604;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice deletion algorithm
 */
public class TestCandidate7
    {

        public static void main(String[] args)
            {

                Candidate4[] election = new Candidate4[10];

                election[0] = new Candidate4("John Smith", 5000);
                election[1] = new Candidate4("Mary Miller", 4000);
                election[2] = new Candidate4("Michael Duffy", 6000);
                election[3] = new Candidate4("Tim Robinson", 2500);
                election[4] = new Candidate4("Joe Ashtony", 1800);
                election[5] = new Candidate4("Mickey Jones", 3000);
                election[6] = new Candidate4("Rebecca Morgan", 2000);
                election[7] = new Candidate4("Kathleen Turner", 8000);
                election[8] = new Candidate4("Tory Parker", 500);
                election[9] = new Candidate4("Ashton Davis", 10000);

                //Original
                System.out.println("Original Results: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                //Woody Pride
                System.out.println();
                delByLoc(election, 6);
                System.out.println("Deleting 6:");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                System.out.println();
                delByName(election, "Kathleen Turner");
                System.out.println("Deleting Kathleen Turner: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));


            }

        public static void printVotes(Candidate4[] election)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        System.out.println(election[i].getName() + "    " + election[i].getNumVotes());
                    }
            }

        public static int getTotal(Candidate4[] election)
            {
                int sum = 0;

                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i] != null)
                            sum += election[i].getNumVotes();
                    }

                return sum;
            }

        public static void printResults(Candidate4[] election)
            {
                System.out.printf("%10s %6s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i] != null)
                            {
                                double percentTotal = 100 * ((double) election[i].getNumVotes() / getTotal(election));

                                System.out.printf("%-15s %s %10d %6s %9.2f\n", election[i].getName(), "|", election[i].getNumVotes(), "|", percentTotal);
                            }
                    }
            }

        public static void replaceName(Candidate4[] election, String name, String repName)
            {
                for(int index = 0; index < election.length; index++)
                    if ((election[index] != null) && (election[index].getName().equals(name)))
                        election[index].setName(repName);
            }

        public static void replaceVotes(Candidate4[] election, String name, int repVotes)
            {
                for(int index = 0; index < election.length; index++)
                    if ((election[index] != null) && (election[index].getName().equals(name)))
                        election[index].setNumVotes(repVotes);
            }

        public static void replaceCandidate(Candidate4[] election, String name, int repVotes, String repName)
            {
                for(int index = 0; index < election.length; index++)
                    if ((election[index] != null) && (election[index].getName().equals(name)))
                        {
                            election[index].setName(repName);
                            election[index].setNumVotes(repVotes);
                        }
            }

        public static void insertPosition(Candidate4[] election, int position, String newName, int votes)
            {
                for (int index = election.length - 1; index > position; index--)
                    election[index] = election[index - 1];

                election[position] = new Candidate4(newName, votes);
            }

        public static void insertCandidate(Candidate4[] election, String name, String newName, int newVotes)
            {
                int location = 0;

                // find location of item you want to insert before
                for(int index = 0; index < election.length; index++)
                    if ((election[index] != null) && (election[index].getName().equals(name)))
                        {
                            location = index;
                            break;
                        }
                    else if (election[index] == null)
                        {
                            location = index;
                            break;
                        }

                //move items down in the array - last item is lost
                for(int index = election.length - 1; index > location; index--)
                    election[index] = election[index-1];

                election[location] = new Candidate4(newName, newVotes);
            }

        public static void delByLoc(Candidate4[] election, int position)
            {
                if ((position > 0) && (position < election.length))
                    {
                        //move items up in the array -
                        for(int index = position; index < election.length -1; index++)
                            election[index] = election[index + 1];

                        election[election.length-1] = null;
                    }
            }

        public static void delByName(Candidate4[] election, String name)
            {
                int location = 0;
                int index;

                // find location of item you want to delete
                for(index = 0; index < election.length; index++)
                    if ((election[index] != null) && (election[index].getName().equals(name)))
                        {
                            location = index;
                            break;
                        }
                    else if (election[index] == null)
                        {
                            location = -1;
                            break;
                        }

                if ((index != election.length) && (location >= 0))
                    { //move items up in the array
                        for(index = location; index < election.length -1; index++)
                            election[index] = election[index + 1];

                        election[election.length-1] = null;
                    }
            }
    }
