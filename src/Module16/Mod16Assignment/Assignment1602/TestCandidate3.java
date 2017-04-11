package Module16.Mod16Assignment.Assignment1602;


/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice transversal algorithm
 */
public class TestCandidate3
    {

        public static void main(String[] args)
            {

                Candidate2[] election = new Candidate2[10];

                election[0] = new Candidate2("John Smith", 5000);
                election[1] = new Candidate2("Mary Miller", 4000);
                election[2] = new Candidate2("Michael Duffy", 6000);
                election[3] = new Candidate2("Tim Robinson", 2500);
                election[4] = new Candidate2("Joe Ashtony", 1800);
                election[5] = new Candidate2("Mickey Jones", 3000);
                election[6] = new Candidate2("Rebecca Morgan", 2000);
                election[7] = new Candidate2("Kathleen Turner", 8000);
                election[8] = new Candidate2("Tory Parker", 500);
                election[9] = new Candidate2("Ashton Davis", 10000);

                //Original
                System.out.println("Original Results: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                //Michael Duffy
                System.out.println();
                replaceName(election, "Michael Duffy", "John Elmos");
                System.out.println("Changing Micheal Duffy to John Elmos: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                //Mickey Jones
                System.out.println();
                replaceVotes(election, "Mickey Jones", 2500);
                System.out.println("Changing Mickey Jones votes to 2500: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));

                //Kathleen Turner
                System.out.println();
                replaceCandidate(election, "Kathleen Turner", 8500, "John Kennedy");
                System.out.println("Changing candidate Kathleen Turner to John Kennedy: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));


            }

        public static void printVotes(Candidate2[] election)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        System.out.println(election[i].getName() + "    " + election[i].getNumVotes());
                    }
            }

        public static int getTotal(Candidate2[] election)
            {
                int sum = 0;

                for (int i = 0; i < election.length; i++)
                    {
                        sum += election[i].getNumVotes();
                    }

                return sum;
            }

        public static void printResults(Candidate2[] election)
            {
                System.out.printf("%9s %5s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.length; i++)
                    {
                        double percentTotal = 100 * ((double)election[i].getNumVotes() / getTotal(election));

                        System.out.printf("%-13s %s %10d %6s %9.2f\n", election[i].getName(), "|", election[i].getNumVotes(), "|", percentTotal);
                    }
            }

        public static void replaceName(Candidate2[] election, String name, String repName)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i].getName().equals(name))
                            election[i].setName(repName);
                    }
            }

        public static void replaceVotes(Candidate2[] election, String name, int repVotes)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        if (election[i].getName().equals(name))
                            election[i].setNumVotes(repVotes);
                    }
            }

        public static void replaceCandidate(Candidate2[] election, String name, int repVotes, String repName)
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

    }
