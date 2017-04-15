package Module18.Mod18Assignments.Assignment1801;

/**
 * @author Tyler
 * @version 4/11/2017
 * @purpose test sequential search
 */
public class TestMusic
    {

        public static void main(String[] args)
            {

                Music[] myMusic = new Music[10];
                myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
                myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
                myMusic[2] = new Music("What If It's You", 1995, "RebaMcEntire");
                myMusic[3] = new Music("Misunderstood", 2001, "Pink");
                myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
                myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
                myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
                myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
                myMusic[8] = new Music("Let It Go", 2007, "TimMcGraw");
                myMusic[9] = new Music("White Flag", 2004, "Dido");

                printMusic(myMusic);

                System.out.println("Search - Title - Let Go");
                searchTitle(myMusic, "Let Go");
                System.out.println();

                System.out.println("Search - Title - Some Day");
                searchTitle(myMusic, "Some Day");
                System.out.println();

                System.out.println("Search - Year - 2001");
                searchYear(myMusic, 2001);
                System.out.println();

                System.out.println("Search - Year - 2003");
                searchYear(myMusic, 2003);
                System.out.println();

                System.out.println("Search - Singer - Avril Lavigne");
                searchSinger(myMusic, "Avril Lavigne");
                System.out.println();

                System.out.println("Search - Singer - Tony Curtis");
                searchSinger(myMusic, "Tony Curtis");
                System.out.println();
            }

        public static void printMusic(Music[] myMusic)
            {
                System.out.printf("%-23s %-5s %-15s\n", "Title", "Year", "Singer");
                System.out.println("-------------------------------------------------");
                for (int i = 0; i < myMusic.length; i++)
                    {
                        System.out.println(myMusic[i]);
                    }
                System.out.println("\n");
            }

        public static void searchTitle(Music[] myMusic, String title)
            {
                int found = -1;

                for (int i = 0; i < myMusic.length; i++)
                        if (myMusic[i].getTitle().compareTo(title) == 0)
                            {
                                found = i;
                                break;
                            }

                if (found != -1)
                    {
                        System.out.println("We found " + title + " in the Library: ");
                        System.out.println(myMusic[found].getTitle() + ", " + myMusic[found] .getYear() + ", " + myMusic[found].getSinger());
                    }
                else
                    {
                        System.out.println("Title not found.");
                    }
            }

        public static void searchYear(Music[] myMusic, int year)
            {
                int found = 0;
                for (int i = 0; i < myMusic.length; i++)
                    {
                        if (myMusic[i].getYear() == year)
                            {
                                System.out.println(myMusic[i].getTitle() + ", " + myMusic[i] .getYear() + ", " + myMusic[i].getSinger());
                                found++;
                            }
                    }
                if (found == 0)
                    {
                        System.out.println("There are no songs for " + year);
                    }
                else
                    {
                        System.out.println("There were " + found + " listings found for " + year);
                    }
            }

        public static void searchSinger(Music[] myMusic, String singer)
            {
                int found = 0;
                for (int i = 0; i < myMusic.length; i++)
                    if (myMusic[i].getSinger().compareTo(singer) == 0)
                        {
                            System.out.println(myMusic[i].getTitle() + ", " + myMusic[i] .getYear() + ", " + myMusic[i].getSinger());
                            found++;
                        }

                if (found == 0)
                    {
                        System.out.println("There are no listings for " + singer);
                    }
                else
                    {
                        System.out.println("There were " + found + " listings for " + singer);
                    }
            }

    }
