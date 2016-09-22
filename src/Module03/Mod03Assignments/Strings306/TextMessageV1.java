package Module03.Mod03Assignments.Strings306;

/**
 * Tyler Spurr
 * 9/22/2016
 * Program is supposed to replace five phrases
 * with standard message abreviations.
 */
public class TextMessageV1
    {

        public static void main(String[] args)
            {

                //initalization
                String message = "sorry brother but i had to \nleave early because jannet \nwanted me home as early as \ni could. hope you have fun \nand talk to you later.";
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
                replaceMessage = replaceMessage.replace("and talk to you later", phrase2);
                replaceMessage = replaceMessage.replace("because jannet", phrase3);
                replaceMessage = replaceMessage.replace("as early as \ni could. ", phrase4);
                replaceMessage = replaceMessage.replace("leave early", phrase5);
                messageLength = replaceMessage.length();
                System.out.println(replaceMessage);
                System.out.println("        Length of message: " + messageLength);



            }

    }
