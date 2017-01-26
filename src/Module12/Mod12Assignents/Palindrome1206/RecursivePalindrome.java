package Module12.Mod12Assignents.Palindrome1206;

/**
 * @author Tyler
 * @version 1/25/2017
 * @purpose
 */
public class RecursivePalindrome
    {

        public char getFirst(String phrase)
            {
                return phrase.charAt(0);
            }

        public char getLast(String phrase)
            {
                int end = phrase.length();
                return phrase.charAt(end - 1);
            }

        public String tester(String phrase)
            {
                phrase = helper(phrase);

                boolean test = getFirst(phrase) == getLast(phrase);

                if (test)
                    {
                        char[] temp = phrase.toCharArray();
                        temp[0] = 0;
                        temp[temp.length - 1] = 0;
                        String phraseRedone = String.valueOf(temp);

                        return tester(phraseRedone);

                    }else if ((phrase.length() == 1 ) || (phrase.length() == 2) )
                    {
                        return "Done";
                    }else
                    {
                        return "No";
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
                System.out.println(phrase);

                return phrase;

            }

    }
