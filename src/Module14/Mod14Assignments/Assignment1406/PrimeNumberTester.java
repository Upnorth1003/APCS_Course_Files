package Module14.Mod14Assignments.Assignment1406;

import java.util.Scanner;

/**
 * @author Tyler Spurr
 * @version 2/26/2017
 * @purpose Calculate prime numbers under a users number.
 */
public class PrimeNumberTester
    {

        public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Under what number do you want to find all the prime numbers: ");
                int input = in.nextInt();
                PrimeNumber.primeNumbers(input);
            }

    }
