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
                String phrase2 = helper(phrase);
                System.out.println(phrase2);

                boolean test = phrase2.substring(beginning, beginning + 1).equals(phrase2.substring(end, end + 1));
                System.out.println(test + " test");

                System.out.println(phrase2.substring(beginning, beginning + 1) + " B");
                System.out.println(phrase2.substring(end, end + 1) + " E");

                if (end == beginning)
                    {
                        System.out.println("True");
                        return "true";
                    }

                if (test)
                    {
                        System.out.println(phrase2 + " Running again");
                        return tester(phrase2, beginning + 1, end - 1 );

                    }else
                    {
                        System.out.println("False");
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
