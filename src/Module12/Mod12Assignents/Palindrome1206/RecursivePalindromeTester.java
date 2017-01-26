package Module12.Mod12Assignents.Palindrome1206;

import java.util.Scanner;

/**
 * @author Tyler
 * @version 1/25/2017
 * @purpose Test to see if a phrase or word is a palindrome.
 */
public class RecursivePalindromeTester
    {

        public static void main(String[] args)
            {
                RecursivePalindrome phrase = new RecursivePalindrome();
                Scanner in = new Scanner(System.in);

                System.out.println("Palindrome Tester");
                System.out.println("Press [Q] to quit");
                System.out.println("Enter word or phrase to test:");
                String input = in.nextLine();

                while (!input.equalsIgnoreCase("q"))
                    {
                        if (phrase.tester(input).equals("Done"))
                            System.out.println("\nYour word/phrase is a Palindrome!");
                        else
                            System.out.println("\nYour word/phrase is not a Palindrome! :(");

                        System.out.println();
                        System.out.println("Enter word or phrase to test:");
                        input = in.nextLine();
                    }
            }

    }
