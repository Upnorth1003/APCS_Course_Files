package Module05.Mod05Assignments.LotteryOdds504;
/**
 * Make a lottery that the user has to guess numbers from
 * @author Tyler Spurr
 * @version 10/24/16
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        
        String lotteryNum;
        String userGuess;
        int turns = 5;

        for (int counter = 0; counter <= turns; counter++ )
        {
            double two = Math.random();
            int twoN = (int)(two * 10);

            double one = Math.random();
            int oneN = (int)(one * 10);

            double three = Math.random();
            int threeN = (int)(three * 10);

            lotteryNum = Integer.toString(oneN) + Integer.toString(twoN) + Integer.toString(threeN);
            String frontTwoL = lotteryNum.substring(0, 2);
            String backTwoL = lotteryNum.substring(2, 3);

            System.out.print("Enter a 3 didget number(ex. 123): ");
            userGuess = input.next();
            String frontTwoU = userGuess.substring(0, 2);
            String backTwoU = userGuess.substring(2, 3);

            if (frontTwoL.equals(frontTwoU) && backTwoL.equals(backTwoU))
            {
                System.out.println("Both pairs match, you won!");

            }else if (frontTwoL.equals(frontTwoU))
            {
                System.out.println("The front pair equal each other, you won!");

            }else if (backTwoL.equals(backTwoU))
            {
                System.out.println("The back pair equal each other, you won!");

            }else
            {
                System.out.println("Your numbers do not match, try again.");
            }
        }

        System.out.println("\n##You finished your " + (turns + 1) + " turns. Please play again!##");
        
    }
}