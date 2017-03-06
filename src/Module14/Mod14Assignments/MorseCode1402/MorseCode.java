package Module14.Mod14Assignments.MorseCode1402;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tyler
 * @version 2/21/2017
 * @purpose
 */
public class MorseCode
    {

        public static void print(String s) throws IOException
            {
                s = s.toLowerCase();
                ArrayList<String> thing = new ArrayList<>();
                String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
                File code = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\MorseCode1402\\morsecode.txt");
                Scanner inFile = new Scanner(code);
                for (int i = 0; i < 37; i++)
                    {
                        thing.add(inFile.nextLine());
                    }

                for(int index = 0; index < s.length(); index++)
                {
                        System.out.println(thing.get(alphabet.indexOf(s.charAt(index))));
                }
                System.out.println();
            }

    }