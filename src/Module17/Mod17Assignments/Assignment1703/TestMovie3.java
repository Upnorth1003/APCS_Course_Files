package Module17.Mod17Assignments.Assignment1703;

/**
 * @author Tyler
 * @version 3/30/2017
 * @purpose Practice selection sort algorithm
 */
public class TestMovie3
    {

        public static void main(String[] args)
            {

                Movie3[] myMovies = new Movie3[10];

                myMovies[0] = new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar");
                myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
                myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
                myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
                myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
                myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman");
                myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
                myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
                myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
                myMovies[9] = new Movie3("Monsters Inc.", 2001, "Pixar");

                System.out.println("The Original: ");
                printMovies(myMovies);

                System.out.println("Sorted by Title - descending: ");
                sortTitles(myMovies, 2);
                printMovies(myMovies);

                System.out.println("Sorted by Year - descending: ");
                sortYears(myMovies,2);
                printMovies(myMovies);

                System.out.println("Sorted by Studio - ascending: ");
                sortStudios(myMovies,1);
                printMovies(myMovies);


            }

        public static void printMovies(Movie3[] myMovies)
            {
                for (int i = 0; i < myMovies.length; i++)
                    {
                        System.out.println(myMovies[i]);
                    }
                System.out.println();
            }

        public static void sortTitles(Movie3[] myMovies, int oneOrTwo)
            {
                if(oneOrTwo == 1)
                    {
                        for (int i = 0; i < myMovies.length - 1; i++)
                            {
                                int minIndex = i;
                                for (int j = i + 1; j < myMovies.length; j++)
                                    {
                                        if ((myMovies[j].getTitle()).compareTo(myMovies[minIndex].getTitle()) < 0)
                                            {
                                                minIndex = j;
                                            }
                                    }
                                Movie3 temp = myMovies[i];
                                myMovies[i] = myMovies[minIndex];
                                myMovies[minIndex] = temp;
                            }
                    }
                else if (oneOrTwo == 2)
                    {
                        for (int i = 0; i < myMovies.length - 1; i++)
                            {
                                int minIndex = i;
                                for (int j = i + 1; j < myMovies.length; j++)
                                    {
                                        if ((myMovies[j].getTitle()).compareTo(myMovies[minIndex].getTitle()) > 0)
                                            {
                                                minIndex = j;
                                            }
                                    }
                                Movie3 temp = myMovies[i];
                                myMovies[i] = myMovies[minIndex];
                                myMovies[minIndex] = temp;
                            }
                    }
                else
                    {
                        System.out.println("ERROR");
                    }
            }

        public static void sortYears(Movie3[] myMovies, int oneOrTwo)
            {
                Movie3 temp;
                int i;
                int k;
                int posmax;
                if(oneOrTwo == 1)
                    {
                        for ( i = myMovies.length - 1 ; i > 0 ; i-- )
                            {
                                posmax = 0;
                                for ( k = 1 ; k <= i ; k++ )
                                    {
                                        if ( myMovies[k].getYear() > myMovies[posmax].getYear() )
                                            {
                                                posmax = k;
                                            }
                                    }
                                temp = myMovies[i];
                                myMovies[i] = myMovies[posmax ];
                                myMovies[posmax] = temp;
                            }
                    }
                else if (oneOrTwo == 2)
                    {
                        for ( i = myMovies.length - 1 ; i > 0 ; i-- )
                            {
                                posmax = 0;
                                for ( k = 1 ; k <= i ; k++ )
                                    {
                                        if ( myMovies[k].getYear() < myMovies[posmax].getYear() )
                                            {
                                                posmax = k;
                                            }
                                    }
                                temp = myMovies[i];
                                myMovies[i] = myMovies[posmax];
                                myMovies[posmax] = temp;
                            }
                    }
                else
                    {
                        System.out.println("ERROR");
                    }
            }

        public static void sortStudios(Movie3[] myMovies, int oneOrTwo)
            {
                if(oneOrTwo == 1)
                    {
                        for (int i = 0; i < myMovies.length - 1; ++i)
                            {
                                int minIndex = i;
                                for (int j = i + 1; j < myMovies.length; ++j)
                                    {
                                        if ((myMovies[j].getStudio()).compareTo(myMovies[minIndex].getStudio()) < 0)
                                            {
                                                minIndex = j;
                                            }
                                    }
                                Movie3 temp = myMovies[i];
                                myMovies[i] = myMovies[minIndex];
                                myMovies[minIndex] = temp;
                            }
                    }
                else if (oneOrTwo == 2)
                    {
                        for (int i = 0; i < myMovies.length - 1; ++i)
                            {
                                int minIndex = i;
                                for (int j = i + 1; j < myMovies.length; ++j)
                                    {
                                        if ((myMovies[j].getStudio()).compareTo(myMovies[minIndex].getStudio()) > 0)
                                            {
                                                minIndex = j;
                                            }
                                    }
                                Movie3 temp = myMovies[i];
                                myMovies[i] = myMovies[minIndex];
                                myMovies[minIndex] = temp;
                            }
                    }
                else
                    {
                        System.out.println("ERROR");
                    }
            }

    }
