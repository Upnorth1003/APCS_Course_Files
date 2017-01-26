package Module12.Mod12Assignents.Fibonacci1205;

import java.util.Scanner;

/**
 * @author Tyler
 * @version 1/24/2017
 * @purpose Calculate the Fibonacci number at a specific position.
 */
public class FibonacciNumbers
    {
        FibonacciNumbers()
            {}

        public int getNumber(int x)
            {
                if (x > 1)
                    {
                        return getNumber(x - 1) + getNumber(x - 2);

                    }else if (x == 1)
                    {
                        return 1;
                    }else if(x < 0)
                    {
                        return -1;
                    }else
                    {
                        return 0;
                    }
            }

        public static void main(String[] args)
            {
                FibonacciNumbers number = new FibonacciNumbers();
                Scanner in = new Scanner(System.in);

                System.out.println("Do not enter a number less than 0");
                System.out.println("Press [Q] to quit");
                System.out.print("What Fibonacci Number do you want to know? ");
                String x = in.next();

                System.out.println(number.getNumber(Integer.parseInt(x)));

                while(!x.equalsIgnoreCase("q"))
                    {
                        System.out.println();
                        System.out.print("What Fibonacci Number do you want to know? ");
                        x = in.next();

                        if (x.equalsIgnoreCase("q"))
                            System.out.println("\nGoodbye");
                        else
                            System.out.println(number.getNumber(Integer.parseInt(x)));
                    }













            }

    }
