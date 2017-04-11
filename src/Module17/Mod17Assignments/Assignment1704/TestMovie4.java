package Module17.Mod17Assignments.Assignment1704;

/**
 * @author Tyler
 * @version 3/30/2017
 * @purpose practice the merge sort algorithm
 */
public class TestMovie4
    {

        public static void main(String[] args)
            {

                Movie4[] myMovies = new Movie4[10];

                myMovies[0] = new Movie4("The Muppets Take Manhattan", 2001, "Columbia Tristar");
                myMovies[1] = new Movie4("Mulan Special Edition", 2004, "Disney");
                myMovies[2] = new Movie4("Shrek 2", 2004, "Dreamworks");
                myMovies[3] = new Movie4("The Incredibles", 2004, "Pixar");
                myMovies[4] = new Movie4("Nanny McPhee", 2006, "Universal");
                myMovies[5] = new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman");
                myMovies[6] = new Movie4("Ice Age", 2002, "20th Century Fox");
                myMovies[7] = new Movie4("Lilo & Stitch", 2002, "Disney");
                myMovies[8] = new Movie4("Robots", 2005, "20th Century Fox");
                myMovies[9] = new Movie4("Monsters Inc.", 2001, "Pixar");

                System.out.println("The Original: ");
                printMovies(myMovies);

                System.out.println("Sorted by Title - ascending: ");
                sortTitles(myMovies);
                printMovies(myMovies);

                System.out.println("Sorted by Year - descending: ");
                sortYears(myMovies, 0, 9);
                printMovies(myMovies);

                System.out.println("Sorted by Studio - ascending: ");
                sortStudios(myMovies);
                printMovies(myMovies);


            }

        public static void printMovies(Movie4[] myMovies)
            {
                for (int i = 0; i < myMovies.length; i++)
                    {
                        System.out.println(myMovies[i]);
                    }
                System.out.println();
            }

        public static void sortTitles(Movie4[] myMovies)
            {
                if (myMovies.length >= 2)
                    {
                        Movie4[] left = new Movie4[myMovies.length / 2];
                        Movie4[] right = new Movie4[myMovies.length - myMovies.length / 2];
                        for (int i = 0; i < left.length; i++)
                            {
                                left[i] = myMovies[i];
                            }
                        for (int i = 0; i < right.length; i++)
                            {
                                right[i] = myMovies[i + myMovies.length / 2];
                            }
                        sortTitles(left);
                        sortTitles(right);
                        mergeTitles(myMovies, left, right);
                    }
            }
        public static void sortYears(Movie4[] myMovies, int low, int high)
            {
                if ( low == high )
                    {
                        return;
                    }
                int mid = ( low + high ) / 2;
                sortYears( myMovies, low, mid );
                sortYears( myMovies, mid + 1, high);
                mergeYears( myMovies, low, mid, high);
            }
        public static void sortStudios(Movie4[] myMovies)
            {
                if (myMovies.length >= 2)
                    {
                        Movie4[] left = new Movie4[myMovies.length / 2];
                        Movie4[] right = new Movie4[myMovies.length - myMovies.length / 2];
                        for (int i = 0; i < left.length; i++)
                            {
                                left[i] = myMovies[i];
                            }
                        for (int i = 0; i < right.length; i++)
                            {
                                right[i] = myMovies[i + myMovies.length / 2];
                            }
                        sortStudios(left);
                        sortStudios(right);
                        mergeStudios(myMovies, left, right);
                    }
            }
        public static void mergeYears( Movie4[] myMovies, int low, int mid, int high )
            {
                Movie4[] temp = new Movie4[ high - low + 1 ];
                int i = low, j = mid + 1,n= 0;
                while ( i <= mid || j <= high )
                    {
                        if ( i > mid )
                            {
                                temp[n] = myMovies[j];
                                j++;
                            }
                        else if ( j > high )
                            {
                                temp[n] = myMovies[i];
                                i++;
                            }
                        else if ( myMovies[i].getYear() > myMovies[j].getYear() )
                            {
                                temp[n] = myMovies[i];
                                i++;
                            }
                        else
                            {
                                temp[n] = myMovies[j];
                                j++;
                            }
                        n++;
                    }
                for ( int k = low ; k <= high ; k++ )
                    {
                        myMovies[k] = temp[k - low];
                    }
            }
        public static void mergeTitles(Movie4[] myMovies, Movie4[] left, Movie4[] right)
            {
                int c = 0;
                int d = 0;
                for (int i = 0; i < myMovies.length; i++)
                    {
                        if (d >= right.length || (c < left.length && (left[c].getTitle()).compareToIgnoreCase(right[d].getTitle()) < 0))
                            {
                                myMovies[i] = left[c];
                                c++;
                            }
                        else
                            {
                                myMovies[i] = right[d];
                                d++;
                            }
                }
            }
        public static void mergeStudios(Movie4[] myMovies, Movie4[] left, Movie4[] right)
            {
                int c = 0;
                int d = 0;
                for (int i = 0; i < myMovies.length; i++)
                    {
                        if (d >= right.length || (c < left.length && (left[c].getStudio()).compareToIgnoreCase(right[d].getStudio()) < 0))
                            {
                                myMovies[i] = left[c];
                                c++;
                            }
                        else
                            {
                                myMovies[i] = right[d];
                                d++;
                            }
                    }
            }

    }
