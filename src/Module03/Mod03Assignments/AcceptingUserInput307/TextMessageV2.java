package Module03.Mod03Assignments.AcceptingUserInput307;

import java.util.Scanner;

/**
 * Tyler Spurr
 * 9/26/2016
 * Program is supposed to replace five phrases
 * with standard message abreviations.
 */
public class TextMessageV2
    {

        public static void main(String[] args)
            {

                //initalization
                Scanner in = new Scanner(System.in);
                System.out.println("Please input your message into the next line! ");
                String message = in.next();
                message += in.nextLine();
                String phrase1 = "sryy bro";
                String phrase2 = "ttyl";
                String phrase3 = "cuz the wife";
                String phrase4 = "asap.\n";
                String phrase5 = "jet";
                int messageLength;
                String replaceMessage;

                //original
                System.out.println("Original Message:");
                System.out.println(message);
                messageLength = message.length();
                System.out.println("        Length of message: " + messageLength + "\n");


                //rephrased
                System.out.println("Rephrased Message:");
                replaceMessage = message.replace("sorry brother", phrase1);
                replaceMessage = replaceMessage.replace("talk to you later", phrase2);
                replaceMessage = replaceMessage.replace("because jannet", phrase3);
                replaceMessage = replaceMessage.replace("as early as i could. ", phrase4);
                replaceMessage = replaceMessage.replace("leave early", phrase5);
                messageLength = replaceMessage.length();
                System.out.println(replaceMessage);
                System.out.println("        Length of message: " + messageLength);
                System.out.println();

                //Samples.
                System.out.println("Type another message below please!");
                String message2 = in.next();
                message2 += in.nextLine();
                String replace;
                int lengthMessage2 = message2.length();

                System.out.println("String method samples:");
                //indexing
                int index = message2.indexOf('r');
                System.out.println("    Index of 'r' in message2:                 " + index);

                //replacing
                replace = message2.replaceAll("[o]", "0");
                System.out.println("    Replace 'o' with 0:                       " + replace);

                //substring
                int thirdMessage2 = lengthMessage2 / 3;
                int fourthMessage2 = (lengthMessage2 / 4);
                System.out.println("    Substring a third of message2:            " + message2.substring(0, thirdMessage2));
                System.out.println("    Substring from a fourth \n\tto a third of message2:                   " + message2.substring(fourthMessage2, thirdMessage2));

            }

    }
