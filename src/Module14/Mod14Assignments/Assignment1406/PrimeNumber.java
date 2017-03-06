package Module14.Mod14Assignments.Assignment1406;


/**
 * @author Tyler Spurr
 * @version 2/26/2017
 * @purpose Calculate prime numbers under a users number.
 */
public class PrimeNumber
    {
        public static int counter = 0;

        /**
         * returns all the numbers that are prime numbers within the limit.
         * @param limit the number that is the 1 - #
         */
        public static void primeNumbers(int limit)
            {
                for (int number = 1; number < limit; number++)
                    {
                        if (isPrime(number))
                            {
                                System.out.println(number);
                                counter++;
                            }
                    }

                System.out.println(counter + " prime numbers from 1-" + limit);
            }

        /**
         * Takes the number and divides it by another to see if it is evenly divided.
         * If it is then the number is not a prime number
         * @param number the number tested to see if it isa prime number
         * @return if number is a prime number or not
         */
        public static boolean isPrime(int number)
            {
                for (int i = 2; i < number; i++)
                    {
                        if (number % i == 0)
                            {
                                return false;
                            }
                    }

                return true;
            }
    }
