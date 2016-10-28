package Module05.Mod05Assignments.MonteCarloMethod506;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Tyler
 * 10/26/2016
 */
public class BottleCapPrize
    {

        public static void main(String[] args) throws IOException
            {
                Scanner in = new Scanner(System.in);
                File fileName = new File("file.txt");
                PrintWriter out = new PrintWriter(fileName);
                Scanner inFile = new Scanner(fileName);
                Random randList = new Random();
                int bottles;
                int trials;
                int match;
                String numberOfBottles;
                double numAdd = 0;
                double average = 0;
                int sum;
                String sumS;
                String matchS;

                System.out.print("How many trials do you want to go through? ");
                trials = in.nextInt();

                for(sum = 1; sum <= 5; sum++)
                    {
                        match = 0;

                        for(int i = 0; i < trials; i++)
                            {
                                bottles  = randList.nextInt(5) + 1;

                                if(bottles == sum)
                                    {
                                        match++;

                                    }
                            }

                        out.println(sum + " " + match);

                    }
                out.close();

                while(inFile.hasNext())
                    {
                        sumS = inFile.next();
                        matchS = inFile.next();
                        numAdd += Integer.parseInt(sumS) * Integer.parseInt(matchS);
                    }
                inFile.close();

                average = numAdd / trials;

                System.out.println("The average bottles to open are: " + average);

            }
    }

