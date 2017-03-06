package Module14.Mod14Assignments.FrequencyAnalysis1407;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tyler
 * @version 2/27/2017
 * @purpose find the frequencies of letters in a passage.
 */
public class FrequencyAnalysis
    {

        private static ArrayList<String> file;

        public static ArrayList file() throws IOException
            {
                File subset = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\FrequencyAnalysis1407\\ciphertext.txt");
                Scanner fileIn = new Scanner(subset);

                ArrayList<String> writing = new ArrayList<>();

                while (fileIn.hasNext())
                    {
                       writing.add(fileIn.next());
                    }

                return writing;
            }

        public static void frequency() throws IOException
            {
                int[] frequency = new int[26];
                String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                file = file();
                PrintWriter outFile = new PrintWriter("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\FrequencyAnalysis1407\\ciphertextfreq.txt");
                int allLeters = 0;

                //For loop to loop through array with the document in it.
                for (int y = 0; y < file.size(); y++)
                    {

                        //System.out.println(file.get(y));

                        //Loop through the word at position i in the arraylist
                        for (int x = 0; x < file.get(y).length(); x++)
                            {
                                String word = file.get(y).toLowerCase();

                                //Looping through alphabet to correspond with letter in word
                                for (int z = 0; z < alphabet.length; z++)
                                    {
                                        //System.out.println(word.substring(x,x+1));

                                        if (word.substring(x, x+1).equals(alphabet[z]))
                                            frequency[z]++;

                                    }

                            }

                    }
                for (int t = 0; t < frequency.length; t++)
                    allLeters += frequency[t];
                //System.out.println(allLeters);

                for (int s = 0; s < frequency.length; s++)
                    {
                        double average = ( frequency[s]/(double)allLeters ) * 100;
                        outFile.printf("%-5d %2s %2s %2s %3.2f\n", frequency[s], "|", alphabet[s], "|", average);
                        System.out.printf("%-5d %2s %2s %2s %3.2f\n", frequency[s], "|", alphabet[s], "|", average);
                    }
                outFile.close();

            }

    }
