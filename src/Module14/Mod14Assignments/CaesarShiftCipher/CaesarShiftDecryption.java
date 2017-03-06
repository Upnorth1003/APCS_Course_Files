package Module14.Mod14Assignments.CaesarShiftCipher;

/**
 * @author Tyler
 * @version 2/22/2017
 * @purpose Decrypt messages
 */
public class CaesarShiftDecryption
    {

        static int myShift;

        public static String cipher(String msg, int shift)
            {
                myShift = shift;
                String s = "";
                int length = msg.length();
                for(int i = 0; i < length; i++)
                    {
                        char c = (char)(msg.charAt(i) - myShift);
                        if (c < 'a')
                            s += (char)(msg.charAt(i) - (myShift + 26));
                        else
                            s += (char)(msg.charAt(i) - myShift);
                    }

                return s.toUpperCase();
            }

        public static String newAlphabet(String alphabet)
            {

                String s = "";
                int length = alphabet.length();
                for(int i = 0; i < length; i++)
                    {
                        char c = (char)(alphabet.charAt(i) + myShift);
                        if (c > 'z')
                            s += (char)(alphabet.charAt(i) - (26-myShift));
                        else
                            s += (char)(alphabet.charAt(i) + myShift);
                    }

                return s.toUpperCase();

            }

    }
