package Module12.Mod12Assignents.Palindrome1206;

/**
 * @author Tyler
 * @version 1/25/2017
 * @purpose
 */
public class RecursivePalindrome
    {


        public String tester(String phrase, int beginning, int end)
            {
                phrase = helper(phrase);
                char[] temp = phrase.toCharArray();
                System.out.println(phrase);

                boolean test = phrase.charAt(beginning) == phrase.charAt(end);
                System.out.println(test + "y");

                if ( temp.length <= 1 )
                    {

                        System.out.println("true2");
                        return "True";

                    }
                if (test)
                    {

                        System.out.println(temp[beginning]);
                        temp[beginning] = 0;

                        System.out.println(temp[end]);
                        temp[end] = 0;

                        String phraseRedone = String.valueOf(temp);

                        System.out.println(phrase);
                        return tester(phraseRedone, beginning + 1, end - 1);

                    }else
                    {
                        System.out.println("false");
                        return "false";
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
