package Module06.Mod06Lessons.NumericArrays601;

import java.util.Scanner;

/**
 * Tyler
 * 11/3/2016
 */
public class NumericArrayDemo1
    {

        public static void main(String [] args)
            {
                int [ ] numbers;
                int start = 0;

                numbers = new int[8];
                Scanner in = new Scanner(System.in);

                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                numbers[3] = 4;
                numbers[4] = 5;
                numbers[5] = 6;
                numbers[6] = 7;

                while(start  <= 7)
                    {
                        System.out.print("Enter a number from 1 - 7 (8 to quit): ");
                        start = in.nextInt();

                        if(start <= 7)
                            {
                                System.out.println("Number: " + numbers[start-1] + " In array spot: " + (start - 1));
                            }
                        else
                            {
                                System.out.println("Thank you.");
                            }
                    }

            }

    }
