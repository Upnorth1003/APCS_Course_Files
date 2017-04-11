package Module17.Mod17Assignments.Assignment1702;

/**
 * @author Tyler
 * @version 3/28/2017
 * @purpose run through of insertion algorithm.
 */
public class TestMovie2
    {

        public static void main(String[] args)
            {
                Movie2[] myMovies = new Movie2[10];
                Movie2[] sortedMovies = new Movie2[10];

                myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
                myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
                myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
                myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
                myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
                myMovies[5] = new Movie2("Curse of the Were-Rabbit", 2006, "Aardman");
                myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
                myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
                myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
                myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");

                System.out.println("Before Sorting:");
                printMovies(myMovies);

                System.out.println("Sorting by Title - ascending:");
                sortedMovies = sortTitles(myMovies, 1);
                printMovies(sortedMovies);

                System.out.println("Sorting by Year - decending:");
                sortedMovies = sortYears(myMovies, 2);
                printMovies(sortedMovies);

                System.out.println("Sorting by Studios: ");
                sortedMovies = sortStudios(myMovies, 1);
                printMovies(sortedMovies);
            }

        public static void printMovies(Movie2[] myMovies)
            {
                for (int i = 0; i < myMovies.length; i++)
                    {
                        System.out.println(myMovies[i]);
                    }
                System.out.println();
            }

        public static Movie2[] sortTitles(Movie2[] myMovies, int oneOrTwo)
            {
                Movie2[] newlist = new Movie2[myMovies.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < myMovies.length; i++)
                            {
                                String next = myMovies[i].getTitle();
                                int insert = 0;
                                int k =i;
                                while(k>0 && insert == 0)
                                    {
                                        if(next.compareTo( newlist[k-1].getTitle() ) > 0)
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = myMovies[i];
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < myMovies.length; i++)
                            {
                                String next = myMovies[i].getTitle();
                                int insert = 0;
                                int k =i;
                                while(k>0 && insert == 0)
                                    {
                                        if(next.compareTo( newlist[k-1].getTitle() ) < 0)
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=myMovies[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

        public static Movie2[] sortYears(Movie2[] myMovies, int oneOrTwo)
            {
                Movie2[] newlist = new Movie2[myMovies.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < myMovies.length; i++)
                            {
                                Movie2 next = myMovies[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getYear() < newlist[k-1].getYear())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=next;
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < myMovies.length; i++)
                            {
                                Movie2 next = myMovies[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getYear() < newlist[k-1].getYear())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=myMovies[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

        public static Movie2[] sortStudios(Movie2[] myMovies, int oneOrTwo)
            {
                Movie2[] newlist = new Movie2[myMovies.length];
                if (oneOrTwo == 1)
                    {
                        for (int i = 0; i < myMovies.length; i++)
                            {
                                String next = myMovies[i].getStudio();
                                int insert = 0;
                                int k = i;
                                while (k > 0 && insert == 0)
                                    {
                                        if (next.compareTo(newlist[k - 1].getStudio()) > 0)
                                            {
                                                insert = k;
                                            } else
                                            {
                                                newlist[k] = newlist[k - 1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = myMovies[i];
                            }
                        return newlist;
                    } else if (oneOrTwo == 2)
                    {
                        for (int i = 0; i < myMovies.length; i++)
                            {
                                String next = myMovies[i].getStudio();
                                int insert = 0;
                                int k = i;
                                while (k > 0 && insert == 0)
                                    {
                                        if (next.compareTo(newlist[k - 1].getStudio()) < 0)
                                            {
                                                insert = k;
                                            } else
                                            {
                                                newlist[k] = newlist[k - 1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = myMovies[i];
                            }
                        return newlist;
                    } else
                    {
                        return newlist;
                    }
            }

    }
