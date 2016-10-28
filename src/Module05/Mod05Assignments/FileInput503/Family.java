package Module05.Mod05Assignments.FileInput503;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/20/16
 * Percent of Boys and girls in families
 */
public class Family
    {

        public static void main(String[] args) throws IOException
            {

                String token;
                File fileName = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module05\\Mod05Assignments\\FileInput503\\MaleFemaleInFamily.txt");
                Scanner inFile = new Scanner(fileName);

                int twoBoys = 0;
                int twoGirls = 0;
                int boyGirl = 0;

                while (inFile.hasNext())
                {
                    token = inFile.nextLine();

                    if (token.equalsIgnoreCase("BB")) {

                    } else if (token.equalsIgnoreCase("GG")) {                        twoBoys++;

                        twoGirls++;

                    } else if (token.equalsIgnoreCase("BG") || token.equalsIgnoreCase("GB")) {
                        boyGirl++;
                    }
                }

                int total = twoBoys + twoGirls + boyGirl;
                double pAllBoys = (twoBoys / (double)total) * 100;
                double pAllGirls = (twoGirls / (double)total) * 100;
                double pBoyGirl = (boyGirl / (double)total) * 100;

                System.out.println("Sample Size: " + total);
                System.out.println("Two Boys: " + pAllBoys + "%");
                System.out.println("One Boy One Girl: " + pBoyGirl + "%");
                System.out.println("Two Girls: " + pAllGirls + "%");

            }

    }
