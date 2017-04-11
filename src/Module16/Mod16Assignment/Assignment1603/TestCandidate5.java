package Module16.Mod16Assignment.Assignment1603;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice transversal algorithm
 */
public class TestCandidate5
    {

        public static void main(String[] args)
            {

                Candidate3[] election = new Candidate3[10];

                election[0] = new Candidate3("John Smith", 5000);
                election[1] = new Candidate3("Mary Miller", 4000);
                election[2] = new Candidate3("Michael Duffy", 6000);
                election[3] = new Candidate3("Tim Robinson", 2500);
                election[4] = new Candidate3("Joe Ashtony", 1800);
                election[5] = new Candidate3("Mickey Jones", 3000);
                election[6] = new Candidate3("Rebecca Morgan", 2000);
                election[7] = new Candidate3("Kathleen Turner", 8000);
                election[8] = new Candidate3("Tory Parker", 500);
                election[9] = new Candidate3("Ashton Davis", 10000);

                //Original
                System.out.println("Original Results: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                //Woody Pride
                System.out.println();
                insertPosition(election, 5, "Woody Pride", 19300);
                System.out.println("Adding Woody Pride:");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                System.out.println();
                insertCandidate(election, "Kathleen Turner", "Joey Anderson", 1100);
                System.out.println("Adding Joy Anderson: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));


            }

        public static void printVotes(Candidate3[] election)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        System.out.println(election[i].getName() + "    " + election[i].getNumVotes());
                    }
            }

        public static int getTotal(Candidate3[] election)
            {
                int sum = 0;

                for (int i = 0; i < election.length; i++)
                    {
                        sum += election[i].getNumVotes();
                    }

                return sum;
            }

        public static void printResults(Candidate3[] election)
            {
                System.out.printf("%9s %5s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.length; i++)
                    {
                        double percentTotal = 100 * ((double)election[i].getNumVotes() / getTotal(election));

                        System.out.printf("%-13s %s %10d %6s %9.2f\n", election[i].getName(), "|", election[i].getNumVotes(), "|", percentTotal);
                    }
            }

        public static void replaceName(Candidate3[] election, String name, String repName)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i].getName().equals(name))
                            election[i].setName(repName);
                    }
            }

        public static void replaceVotes(Candidate3[] election, String name, int repVotes)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i].getName().equals(name))
                            election[i].setNumVotes(repVotes);
                    }
            }

        public static void replaceCandidate(Candidate3[] election, String name, int repVotes, String repName)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i].getName().equals(name))
                            {
                                election[i].setName(repName);
                                election[i].setNumVotes(repVotes);
                            }
                    }
            }

        public static void insertPosition(Candidate3[] election, int position, String newName, int votes)
            {
                for (int index = election.length - 1; index > position; index--)
                    election[index] = election[index - 1];

                election[position] = new Candidate3(newName, votes);
            }

        public static void insertCandidate(Candidate3[] election, String name, String newName, int newVotes)
            {
                int location = 0;

                for (int i = 0; i < election.length; i++)
                    if (election[i].getName().equals(name))
                        location = i;

                for (int i = election.length - 1; i > location; i--)
                    election[i] = election[i - 1];

                election[location] = new Candidate3(newName, newVotes);
            }

    }
