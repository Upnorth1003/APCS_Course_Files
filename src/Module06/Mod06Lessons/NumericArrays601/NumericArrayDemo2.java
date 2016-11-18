package Module06.Mod06Lessons.NumericArrays601;

import java.util.Scanner;

/**
 * Tyler
 * 11/3/2016
 */
public class NumericArrayDemo2
    {

        public static void main(String[] args)
            {

                double [] numbers = {.05, 1.02, 123.2, 12.3, 123.465, 453.25, 452};
                int start = 0;

                Scanner in = new Scanner(System.in);

                while(start <= 7)
                    {

                        System.out.print("Enter a number from 1 - 7 (8 to quit): ");
                        start = in.nextInt();

                        if(start <= 7)
                            {
                                System.out.println("Number " + start + " is: " + numbers[start - 1]
                                                    + " in array spot: " + (start-1));
                            }else
                            {
                                System.out.println("Thank you.");
                            }

                    }

            }

    }
