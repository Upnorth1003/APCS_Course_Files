package Module16.Mod16Assignment.Assignment1604;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/19/2017
 * @purpose Practice Deletion algorithm.
 */
public class TestCandidate8
    {

        public static void main(String[] args)
            {

                List<Candidate4> election = new ArrayList<>();

                election.add(new Candidate4("John Smith", 5000));
                election.add(new Candidate4("Mary Miller",4000));
                election.add(new Candidate4("Michael Duffy", 6000));
                election.add(new Candidate4("Tim Robinson", 2500));
                election.add(new Candidate4("Joe Ashtony", 1800));
                election.add(new Candidate4("Mickey Jones", 3000));
                election.add(new Candidate4("Rebecca Morgan", 2000));
                election.add(new Candidate4("Kathleen Turner", 8000));
                election.add(new Candidate4("Tory Parker", 500));
                election.add(new Candidate4("Ashton Davis", 10000));

                //Original
                System.out.println("Original Results: ");
                System.out.println();
                printResults(election);
                System.out.println("Total number of votes is " + getTotal(election));


                System.out.println();
                delByLocation(election, 6);
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

        public static void printVotes(List<Candidate4> election)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        System.out.println(election.get(i).getName() + "    " + election.get(i).getNumVotes());
                    }
            }

        public static int getTotal(List<Candidate4> election)
            {
                int sum = 0;

                for (int i = 0; i < election.size(); i++)
                    {
                        sum += election.get(i).getNumVotes();
                    }

                return sum;
            }

        public static void printResults(List<Candidate4> election)
            {
                System.out.printf("%10s %6s %6s %s %8s\n", "Name", "|", "Number of Votes", "|", "Percent Total");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < election.size(); i++)
                    {
                        double percentTotal = 100 * ((double)election.get(i).getNumVotes() / getTotal(election));

                        System.out.printf("%-15s %s %10d %6s %9.2f\n", election.get(i).getName(), "|", election.get(i).getNumVotes(), "|", percentTotal);
                    }
            }

        public static void replaceName(List<Candidate4> election, String name, String repName)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            election.get(i).setName(repName);
                    }
            }

        public static void replaceVotes(List<Candidate4> election, String name, int repVotes)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            election.get(i).setNumVotes(repVotes);
                    }
            }

        public static void replaceCandidate(List<Candidate4> election, String name, int repVotes, String repName)
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

        public static void insertPosition(List<Candidate4> election, int position, String Nname, int votes)
            {
                election.add(position - 1, new Candidate4(Nname, votes));
            }

        public static void insertCandidate(List<Candidate4> election, String candidate, String newName, int votes)
            {
                int location = 0;

                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(candidate))
                            location = i;
                    }

                election.add(location, new Candidate4(newName, votes));
            }

        public static void delByLocation(List<Candidate4> election, int position)
            {
                election.remove(position);
            }

        public static void delByName(List<Candidate4> election, String name)
            {
                for (int i = 0; i < election.size(); i++)
                    {
                        if (election.get(i).getName().equals(name))
                            election.remove(i);
                    }
            }
    }
