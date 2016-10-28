package Module05.Mod05Assignments.RandomDice505;
/**
 * Calculate the percentage of matches when rolling dice;
 *
 * @author Tyler Spurr
 * @version 10/26/16
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
    	//Declare and initialize variables and objects
        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches the current sum
        int die2 = 0;
        int die1 = 0;
        double probability = 0.0;
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();

        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Please enter the number of sides on a die: ");
        numSides = in.nextInt();
        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();

        //Print heading for output table
        System.out.print("\n Sum of dice \t Probability \n");

        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************

        for( sum = 2; sum <= (numSides * 2); sum++ )//Loop to increment through the possible sums of the dice7
        {

            match =0;

            for( int roll  = 0; roll < numRolls; roll++ )//Loop to throw dice given number of times
            {
                die2 = randNum.nextInt( numSides ) +1;//Randomly generate values for two dice
                die1 = randNum.nextInt( numSides ) +1;

                if ( die1 + die2 == sum )//Check if the sum of dice is equal to the given sum
                {
                    match++;

                } // end if

            }//end for

            probability = (double)match / numRolls * 100;//After all throws, calculate percentage of throws that resulted in the given sum
            System.out.println("    " + sum + "\t\t" + probability );//Print results

        } //end for


// Use the code below to complete the program. All statements are complete and when placed in the proper order, the program will work!
// Be sure to indent code properly and include documation for each section..


    } //end main
}//end class DiceProbability
