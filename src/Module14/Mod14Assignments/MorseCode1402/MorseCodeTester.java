package Module14.Mod14Assignments.MorseCode1402;

import java.io.IOException;
import java.util.Scanner;

import static Module14.Mod14Assignments.MorseCode1402.MorseCode.print;


/**
 * @author Tyler Spurr
 * @version 2/21/2017
 * @purpose to translate english into morse code
 */
public class MorseCodeTester
    {

        public static void main(String[] args) throws IOException
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a message (without punctuation): ");
                String message = in.nextLine();
                MorseCode one = new MorseCode();

                print(message);



            }


    }
