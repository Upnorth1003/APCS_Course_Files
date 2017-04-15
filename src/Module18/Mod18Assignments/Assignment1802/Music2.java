package Module18.Mod18Assignments.Assignment1802;

/**
 * @author Tyler
 * @version 4/11/2017
 * @purpose
 */
public class Music2
    {
        private String title, singer;
        private int year;

        public Music2(String title, int year, String singer)
            {
                this.title = title;
                this.year = year;
                this.singer = singer;
            }

        public String getTitle()
            {
                return title;
            }
        public String getSinger()
            {
                return singer;
            }
        public int getYear()
            {
                return year;
            }

        public void setTitle(String newTitle)
            {
                title = newTitle;
            }
        public void setYear(int newYear)
            {
                year = newYear;
            }
        public void setSinger(String newSinger)
            {
                singer = newSinger;
            }

        public String toString()
            {
                return String.format("%-23s", title) + "\t" + String.format("%-6s", year) +
                        "\t" + String.format("%-14s", singer);
            }

    }
