package Module05.Mod05Assignments.PasswordGenerator507;

import java.util.Random;
import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/27/2016
 * Generate passwords
 */
public class Password
    {
        public static void main(String[] args)
            {
                //variable init.
                Scanner in = new Scanner(System.in);
                int selection;
                int length = 0;
                int randNum = 0;
                Random ranList = new Random();
                String password = "";


                //menu output
                System.out.println("\t\t\t\tPassword Generator Menu");
                System.out.println("*******************************************************");
                System.out.println("*\t{1} Lowercase Letters                             *");
                System.out.println("*\t{2} Lowercase and Numbers                         *");
                System.out.println("*\t{3} Lowercase, Uppercase, & Number                *");
                System.out.println("*\t{4} Lowercase, Uppercase, Number, & Punctuation   *");
                System.out.println("*\t{5} Quit                                          *");
                System.out.println("*******************************************************");


                System.out.print("Enter Selection (1-5): "); //selection enter
                selection = in.nextInt();

                while( (selection > 5) || (selection < 1) ) // if selection is not on menu
                    {
                        System.out.println("Not a selection.\n");
                        System.out.print("Enter Selection (1-5): ");
                        selection = in.nextInt();
                    }

                while(selection != 5) // loop for when the selection is not 5
                    {
                        System.out.print("Enter Length (6 or more): "); // length enter
                        length = in.nextInt();

                        while(length < 6) //Error statement if < 6 is chosen
                            {
                                System.out.print("##Length too small enter a bigger one: "); //enter a new length
                                length = in.nextInt();
                            }

                        if(selection == 4) //selection 4
                            {
                                for(int i = 0; i < length; i++ )
                                    {
                                        while(!((randNum >= 97 && randNum <= 122) || (randNum >= 65 && randNum <= 132) || (randNum >= 33 && randNum <= 64)))
                                            {
                                                randNum = ranList.nextInt(127) + 1;
                                            }
                                        password += (char) randNum;
                                        randNum = 0;
                                    }
                                System.out.println("\tPassword: " + password +"\n");
                                password = "";

                            }
                        else if(selection == 3) //selection 3
                            {
                                for(int i = 0; i < length; i++ )
                                    {
                                        while(!((randNum >= 97 && randNum <= 122) || (randNum >= 65 && randNum <= 132) || (randNum >= 48 && randNum <= 57)))
                                            {
                                                randNum = ranList.nextInt(127) + 1;
                                            }
                                        password += (char) randNum;
                                        randNum = 0;
                                    }
                                System.out.println("\tPassword: " + password +"\n");
                                password = "";

                            }
                        else if(selection == 2) //selection 2
                            {
                                for(int i = 0; i < length; i++ )
                                    {
                                        while(!((randNum >= 97 && randNum <= 122) || (randNum >= 48 && randNum <= 57)))
                                            {
                                                randNum = ranList.nextInt(127) + 1;
                                            }
                                        password += (char) randNum;
                                        randNum = 0;
                                    }
                                System.out.println("\tPassword: " + password +"\n");
                                password = "";

                            }
                        else if(selection == 1) //When selection 1 is chosen
                            {
                                for(int i = 0; i < length; i++ )
                                    {
                                        while(!(randNum >= 97 && randNum <= 122))
                                            {
                                                randNum = ranList.nextInt(127) + 1;
                                            }
                                        password += (char) randNum;
                                        randNum = 0;
                                    }
                                System.out.println("\tPassword: " + password +"\n");
                                password = "";
                            }

                        System.out.print("Enter Selection (1-5): "); //loop back through selections
                        selection = in.nextInt();

                    }

                //Prints result if 5 is chosen
                if(selection == 5)
                    System.out.println("\tGoodBye");



            }
    }
