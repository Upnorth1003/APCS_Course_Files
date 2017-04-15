package Module18.Mod18Assignments.Assignment1802;

/**
 * @author Tyler
 * @version 4/11/2017
 * @purpose test binary search
 */
public class TestMusic2
    {

        public static void main(String[] args)
            {

                Music2[] myMusic2 = new Music2[10];
                myMusic2[0] = new Music2("Pieces of You", 1994, "Jewel");
                myMusic2[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morissette");
                myMusic2[2] = new Music2("What If It's You", 1995, "Reba McEntire");
                myMusic2[3] = new Music2("Misunderstood", 2001, "Pink");
                myMusic2[4] = new Music2("Laundry Service", 2001, "Shakira");
                myMusic2[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
                myMusic2[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
                myMusic2[7] = new Music2("Let Go", 2002, "Avril Lavigne");
                myMusic2[8] = new Music2("Let It Go", 2007, "Tim McGraw");
                myMusic2[9] = new Music2("White Flag", 2004, "Dido");

                int test = 0;
                printMusic2(myMusic2);
                myMusic2 = sort(myMusic2);

                test = searchTitle(myMusic2, "Misunderstood");
                System.out.println("Search - Title - Misunderstood");
                if (test != -1)
                    {
                        System.out.println("Found: " + myMusic2[test].getTitle() + ", " + myMusic2[test].getYear() + ", " + myMusic2[test].getSinger());
                    }
                else
                    {
                        System.out.println("Not found.");
                    }
                System.out.println();

                test = searchTitle(myMusic2, "Under Paid");
                System.out.println("Search - Title - Under Paid");
                if (test != -1)
                    {
                        System.out.println("Found: " + myMusic2[test].getTitle() + ", " + myMusic2[test].getYear() + ", " + myMusic2[test].getSinger());
                    }
                else
                    {
                        System.out.println("Not found.");
                    }
                System.out.println();

                searchYear(myMusic2, 2005);
                searchYear(myMusic2, 2006);
                searchSinger(myMusic2, "Darth Maul");
                searchSinger(myMusic2, "Dido");

            }

        public static void printMusic2(Music2[] myMusic)
            {
                System.out.printf("%-25s%-6s%-20s\n", "Title", "Year", "Singer");
                System.out.println("---------------------------------------------------");
                for(int i = 0; i < myMusic.length; i++)
                    {
                        System.out.println(myMusic[i]);
                    }
                System.out.println();
            }

        public static Music2[] sort(Music2[] myMusic)
            {
                Music2[] sorted = new Music2[myMusic.length];
                for ( int i = 0 ; i < myMusic.length ; i++ )
                    {
                        String next = myMusic[i].getTitle();
                        int index = 0;
                        int k = i;
                        while ( k > 0 && index == 0 )
                            {
                                if ( next.compareTo(sorted[k - 1].getTitle()) > 0 )
                                    {
                                        index = k;
                                    }
                                else
                                    {
                                        sorted[k] = sorted[k - 1];
                                    }
                                k--;
                            }
                        sorted[index] = myMusic[i];
                    }
                return sorted;
            }

        public static int searchTitle(Music2[] myMusic, String title )
            {
                int high = myMusic.length;
                int low = -1;
                int probe;

                while ( high - low > 1 )
                    {
                        probe = ( high + low ) / 2;
                        if ( myMusic[probe].getTitle().compareTo(title) > 0)
                            {
                                high = probe;
                            }
                        else
                            {
                                low = probe;
                            }
                    }
                if ( (low >= 0) && (myMusic[low].getTitle().compareTo(title) == 0 ))
                    {
                        return low;
                    }
                else
                    {
                        return -1;
                    }
            }

        public static void searchYear(Music2[] myMusic, int year)
            {
                int found = 0;

                System.out.println("Search - Year - " + year);
                for(int i = 0; i < myMusic.length; i++)
                    {
                        if (myMusic[i].getYear() == year)
                            {
                                System.out.println("Found: " + myMusic[i].getTitle() + ", " + myMusic[i].getYear() + ", " + myMusic[i].getSinger());
                                found++;
                            }
                    }
                if (found == 0)
                    {
                        System.out.println("Not found.");
                    }
                System.out.println();
            }

        public static void searchSinger(Music2[] myMusic, String singer)
            {
                int found = 0;

                System.out.println("Search - Singer - " + singer);
                for(int i = 0; i < myMusic.length; i++)
                    {
                        if (myMusic[i].getSinger().compareTo(singer) == 0)
                            {
                                System.out.println("Found: " + myMusic[i].getTitle() + ", " + myMusic[i].getYear() + ", " + myMusic[i].getSinger());
                                found++;
                            }
                    }
                if (found == 0)
                    {
                        System.out.println("Not found.");
                    }
                System.out.println();
            }

    }
