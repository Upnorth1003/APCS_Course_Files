package Module03.Mod03Lessons.AsciiArt303;

/**
 * This program uses String objects to print an ASCII art message
 *
 * @FLVS 2007
 * @author B. Jordan
 * @Version 03/05/07
 */
public class AsciiArt
    {

        public static void main(String[] args)
            {
                //local variables
                String row1 ="  *   ***** ***** *****   ***** ***** ***** *   * *****  *";
                String row2 =" *  * *   * *     *       *   * *   * *     *  *  *      *";
                String row3 ="***** ***** *     *****   ***** *   * *     * *   *****  *";
                String row4 ="*   * *     *         *   *  *  *   * *     *  *      *   ";
                String row5 ="*   * *     ***** *****   *   * ***** ***** *   * *****  *";

                //print ASCII art
                System.out.println(row1);
                System.out.println(row2);
                System.out.println(row3);
                System.out.println(row4);
                System.out.println(row5);
            }

            /*
            \n  newline
            \t  tab
            \"  double quote
            \'  Single quote
            \\  backslash
            \r  carriage return
            \f form feed
             */

    }
