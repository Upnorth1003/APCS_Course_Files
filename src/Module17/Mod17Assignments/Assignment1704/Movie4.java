package Module17.Mod17Assignments.Assignment1704;

/**
 * @author Tyler
 * @version 3/28/2017
 * @purpose shell method
 */
public class Movie4
    {
        private String title, studio;
        private int year;

        public Movie4(String title, int year, String studio)
            {
                this.title = title;
                this. year = year;
                this.studio = studio;
            }

        public String getTitle()
            {
                return title;
            }
        public int getYear()
            {
                return year;
            }
        public String getStudio()
            {
                return studio;
            }

        public void setStudio(String newStudio)
            {
                this.studio = newStudio;
            }
        public void setYear(int newYear)
            {
                this.year = newYear;
            }
        public void setTitle(String newTitle)
            {
                this.title = newTitle;
            }

        public String toString()
            {
                return title + " , " + year + " , " + studio;
            }
    }
