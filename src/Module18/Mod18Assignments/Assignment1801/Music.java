package Module18.Mod18Assignments.Assignment1801;

/**
 * @author Tyler
 * @version 4/11/2017
 * @purpose
 */
public class Music
    {

        private String title, singer;
        private int year;

        public Music(String title, int year, String singer)
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

        public String toString()
            {
                return String.format("%-24s", title) + String.format("%-6d", year) + String.format("%-15s", singer);
            }

    }
