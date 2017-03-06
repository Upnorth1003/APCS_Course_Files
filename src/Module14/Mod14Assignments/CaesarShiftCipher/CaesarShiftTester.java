package Module14.Mod14Assignments.CaesarShiftCipher;

import java.util.Scanner;

/**
 * @author Tyler
 * @version 2/21/2017
 * @purpose to encrypt and decrypt caesar shifts, using static methods.
 */
public class CaesarShiftTester
    {

        final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

        public static void main(String[] args)
            {
                //menu
                Scanner in = new Scanner(System.in);
                System.out.println("###################");
                System.out.println("# Decryption[D]   #");
                System.out.println("# Encryption[E]   #");
                System.out.println("# Quit[Q]         #");
                System.out.println("###################");
                System.out.print("Choose an option: ");
                String option = in.next();
                System.out.println();

                while (!option.equalsIgnoreCase("Q"))
                    {
                        if (option.equalsIgnoreCase("e"))
                            {
                                System.out.print("Enter in a shift key value of 0-25: ");
                                int shift = in.nextInt();
                                System.out.println("Enter in a message to decode: ");
                                String message = in.next();
                                System.out.println();

                                //print out of coded message
                                System.out.println("Your encrypted message sir/madame: ");
                                System.out.println(CaesarShiftEncryption.cipher(message, shift));
                                System.out.print("New Alphabet: ");
                                System.out.println(CaesarShiftEncryption.newAlphabet(alphabet, shift));
                                System.out.println();

                                System.out.print("Choose another option: ");
                                option = in.next();

                            }
                        else if (option.equalsIgnoreCase("d"))
                            {

                                System.out.println("Enter the message you want to decode: ");
                                String message = in.next();
                                System.out.print("Enter your guess at the shift key 0-25: ");
                                int shift = in.nextInt();
                                System.out.println();

                                System.out.println("Your try at decrypting the message: ");
                                System.out.println(CaesarShiftDecryption.cipher(message, shift));
                                System.out.print("Your decryption alphabet: ");
                                System.out.println(CaesarShiftDecryption.newAlphabet(alphabet));
                                System.out.println();

                                System.out.print("Want to try that again with a new shift (y/n): ");
                                String tryAgain = in.next();
                                System.out.println();

                                //trying until you get cipher right
                                while (tryAgain.equalsIgnoreCase("y"))
                                    {
                                        System.out.print("Enter your guess at the shift key 0-25: ");
                                        shift = in.nextInt();
                                        System.out.println();

                                        System.out.println("Your try at decrypting the message: ");
                                        System.out.println(CaesarShiftDecryption.cipher(message, shift));
                                        System.out.print("Your decryption alphabet: ");
                                        System.out.println(CaesarShiftDecryption.newAlphabet(alphabet));
                                        System.out.println();

                                        System.out.print("Want to try that again with a new shift (y/n): ");
                                        tryAgain = in.next();
                                    }

                                System.out.print("Choose another option:");
                                option = in.next();
                                System.out.println();

                            }
                        else
                            {
                                System.out.print("That is not an option, please try again: ");
                                option = in.next();
                            }
                    }

                System.out.println("\nGoodbye!");

            }

    }
