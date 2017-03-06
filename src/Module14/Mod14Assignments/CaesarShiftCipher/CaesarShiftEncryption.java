package Module14.Mod14Assignments.CaesarShiftCipher;

/**
 * @author Tyler
 * @version 2/21/2017
 * @purpose encrypt messages
 */
public class CaesarShiftEncryption
    {

        public static String cipher(String msg, int shift)
            {
                String s = "";
                int length = msg.length();
                for(int i = 0; i < length; i++)
                    {
                        char c = (char)(msg.charAt(i) + shift);
                        if (c > 'z')
                             s += (char)(msg.charAt(i) - (26-shift));
                         else
                             s += (char)(msg.charAt(i) + shift);
                    }

                return s.toUpperCase();
            }

        public static String newAlphabet(String alphabet, int shift)
            {

                String s = "";
                int length = alphabet.length();
                for(int i = 0; i < length; i++)
                    {
                        char c = (char)(alphabet.charAt(i) + shift);
                        if (c > 'z')
                            s += (char)(alphabet.charAt(i) - (26-shift));
                        else
                            s += (char)(alphabet.charAt(i) + shift);
                    }

                return s.toUpperCase();

            }

    }
