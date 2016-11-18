package Module06.Mod06Lessons.NumericArrays601;

import java.util.Scanner;

/**
 * Tyler
 * 11/3/2016
 */
public class NumericArrayDemo3
    {

        public static void main(String[] args)
            {

                int [] numbers = new int[5];

                Scanner in = new Scanner(System.in);

                for(int n = 0; n <= 4; n++)
                    {
                        System.out.println("Enter a number for slot " + (n+1) + ": ");
                        numbers[n] = in.nextInt();

                    }

                for(int n = 0; n <= 4; n++)
                    {
                        System.out.println("Slot number " + (n+1) + " is: " + numbers[n] + " IN array position " + n + ".");
                    }

            }

    }
