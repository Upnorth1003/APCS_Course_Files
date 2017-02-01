package Module12.Mod12Assignents.ChallengeExam1208;

import java.util.Scanner;

/**
 * @author Tyler
 * @version 1/31/2017
 * @purpose Find the prime numbers under the users value
 */
public class PrimeNumbers
    {

        PrimeNumbers()
            {

            }

        public int primeNumbers(int number, double i)
            {
                if (i == 1)
                    {
                        System.out.println(number);
                    }
                else if (number % i == 0)
                    {
                        return 0;
                    }
                else
                    {
                        return primeNumbers(number, i - 1);
                    }

                return 1;
            }

        public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                PrimeNumbers joe= new PrimeNumbers();

                System.out.println("Under what number do you want to find all the prime numbers: ");
                int input = in.nextInt();

                for (int i = 0; i <= input; i++)
                    {
                        joe.primeNumbers(i, Math.ceil(Math.sqrt(i)));
                    }
            }

    }
