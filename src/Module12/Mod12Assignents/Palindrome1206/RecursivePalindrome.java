package Module12.Mod12Assignents.Palindrome1206;

/**
 * @author Tyler
 * @version 1/25/2017
 * @purpose
 */
public class RecursivePalindrome
    {


        public String tester(String phrase)
            {
                String phrase2 = helper(phrase);
                //System.out.println(phrase2);

                String phrase3 = new StringBuilder(phrase2).reverse().toString();
                //System.out.println(phrase3);

                if (phrase2.equalsIgnoreCase(phrase3))
                    {
                        //System.out.println("True");
                        return "true";
                    }
                if (!phrase2.equalsIgnoreCase(phrase3))
                    {
                        //System.out.println("False");
                        return "false";
                    }else
                    {
                        return "Oh NO";
                    }

            }

        //Working fine
        public String helper(String phrase)
            {
                char[] temp;
                temp = phrase.toCharArray();

                for (int i = 0; i < temp.length; i++)
                    {
                        if ((temp[i] <= 64) && (temp[i] >= 32))
                            temp[i] = 0;
                    }

                phrase = String.valueOf(temp);
                phrase = phrase.toLowerCase();

                return phrase;

            }

    }
