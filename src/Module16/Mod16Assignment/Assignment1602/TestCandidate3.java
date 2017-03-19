package Module16.Mod16Assignment.Assignment1602;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice removal algorithm.
 */
public class TestCandidate3
    {

        public static void main(String[] args)
            {

                List<Candidate3> election = new ArrayList<>();

                election.add(new Candidate3("John Smith", 5000));
                election.add(new Candidate3("Mary Miller",4000));
                election.add(new Candidate3("Michael Duffy", 6000));
                election.add(new Candidate3("Tim Robinson", 2500));
                election.add(new Candidate3("Joe Ashtony", 1800));
                election.add(new Candidate3("Mickey Jones", 3000));
                election.add(new Candidate3("Rebecca Morgan", 2000));
                election.add(new Candidate3("Kathleen Turner", 8000));
                election.add(new Candidate3("Tory Parker", 500));
                election.add(new Candidate3("Ashton Davis", 10000));

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

        public static void printVotes(List<Candidate3> election)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        System.out.println(election.get(i).getName() + "    " + election.get(i).getNumVotes());
                    }
            }

        public static int getTotal(List<Candidate3> election)
            {
                int sum = 0;

                for (int i = 0; i < election.size(); i++)
                    {
                        sum += election.get(i).getNumVotes();
                    }

                return sum;
            }

        public static void printResults(List<Candidate3> election)
            {
                System.out.printf("%10s %6s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.size(); i++)
                    {
                        double percentTotal = 100 * ((double)election.get(i).getNumVotes() / getTotal(election));

                        System.out.printf("%-15s %s %10d %6s %9.2f\n", election.get(i).getName(), "|", election.get(i).getNumVotes(), "|", percentTotal);
                    }
            }

        public static void replaceName(List<Candidate3> election, String name, String repName)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            election.get(i).setName(repName);
                    }
            }

        public static void replaceVotes(List<Candidate3> election, String name, int repVotes)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            election.get(i).setNumVotes(repVotes);
                    }
            }

        public static void replaceCandidate(List<Candidate3> election, String name, int repVotes, String repName)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            {
                                election.get(i).setNumVotes(repVotes);
                                election.get(i).setName(repName);
                            }
                    }
            }

    }
