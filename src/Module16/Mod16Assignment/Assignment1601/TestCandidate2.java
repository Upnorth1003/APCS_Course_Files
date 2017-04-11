package Module16.Mod16Assignment.Assignment1601;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice transversal algorithm
 */
public class TestCandidate2
    {

        public static void main(String[] args)
            {

                List<Candidate> election = new ArrayList<>();

                election.add(new Candidate("John Smith", 5000));
                election.add(new Candidate("Mary Miller",4000));
                election.add(new Candidate("Michael Duffy", 6000));
                election.add(new Candidate("Tim Robinson", 2500));
                election.add(new Candidate("Joe Ashtony", 1800));

                printVotes(election);
                System.out.println();
                printResults(election);

                System.out.println("Total number of votes is " + getTotal(election));


            }

        public static void printVotes(List<Candidate> election)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        System.out.println(election.get(i).getName() + "    " + election.get(i).getNumVotes());
                    }
            }

        public static int getTotal(List<Candidate> election)
            {
                int sum = 0;

                for (int i = 0; i < election.size(); i++)
                    {
                        sum += election.get(i).getNumVotes();
                    }

                return sum;
            }

        public static void printResults(List<Candidate> election)
            {
                System.out.printf("%9s %5s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.size(); i++)
                    {
                        double percentTotal = 100 * ((double)election.get(i).getNumVotes() / getTotal(election));

                        System.out.printf("%-13s %s %10d %6s %9.2f\n", election.get(i).getName(), "|", election.get(i).getNumVotes(), "|", percentTotal);
                    }
            }

    }
