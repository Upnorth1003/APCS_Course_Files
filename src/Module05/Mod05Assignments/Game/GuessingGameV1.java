package Module05.Mod05Assignments.Game;

import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/19/16
 * Make user guess the number the computer picked from 0-100
 */
public class GuessingGameV1
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);
                int guess = 0;
                int counter = 0;

                //random Number gen 0-99
                double randomDouble = Math.random();
                double d = randomDouble * 100;

                int randomInt = (int)d + 1;

                System.out.print("Enter your guess (0-100): ");
                guess = in.nextInt();

                while (guess != randomInt)
                {

                    if (guess > randomInt)
                    {
                        System.out.println("Guess is too high.");
                    }else if (guess < randomInt)
                    {
                        System.out.println("Guess is too low. ");
                    }

                    System.out.print("Enter your guess: ");
                    guess = in.nextInt();
                    counter++;

                }

                if (guess == randomInt)
                {
                    System.out.print("Congratulations!\nThe random number was: " + randomInt + "\nNumber of tries: " + counter);

                }





            }

    }
