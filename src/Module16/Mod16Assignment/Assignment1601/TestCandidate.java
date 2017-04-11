package Module16.Mod16Assignment.Assignment1601;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice transversal algorithm
 */
public class TestCandidate
    {

        public static void main(String[] args)
            {

                Candidate[] election = new Candidate[5];

                election[0] = new Candidate("John Smith", 5000);
                election[1] = new Candidate("Mary Miller", 4000);
                election[2] = new Candidate("Michael Duffy", 6000);
                election[3] = new Candidate("Tim Robinson", 2500);
                election[4] = new Candidate("Joe Ashtony", 1800);

                printVotes(election);
                System.out.println();
                printResults(election);

                System.out.println("Total number of votes is " + getTotal(election));


            }

        public static void printVotes(Candidate[] election)
            {
                for (int i = 0; i < election.length; i++)
                    {
                        System.out.println(election[i].getName() + "    " + election[i].getNumVotes());
                    }
            }

        public static int getTotal(Candidate[] election)
            {
                int sum = 0;

                for (int i = 0; i < election.length; i++)
                    {
                        sum += election[i].getNumVotes();
                    }

                return sum;
            }

        public static void printResults(Candidate[] election)
            {
                System.out.printf("%9s %5s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.length; i++)
                    {
                        double percentTotal = 100 * ((double)election[i].getNumVotes() / getTotal(election));

                        System.out.printf("%-13s %s %10d %6s %9.2f\n", election[i].getName(), "|", election[i].getNumVotes(), "|", percentTotal);
                    }
            }

    }
