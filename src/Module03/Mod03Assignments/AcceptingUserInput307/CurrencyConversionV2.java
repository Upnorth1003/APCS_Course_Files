package Module03.Mod03Assignments.AcceptingUserInput307;

import java.util.Scanner;

/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 *
 * @Modified by: Tyler Spurr
 * @Date: 9/26/16
 */
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRage;      			// local variable for exchange rate of Pesos to USD
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here
		double pesoToDollar;
		double yenToDollar;
		double euroToDollar;
		double yenSpent = 99939.75;
		double euroSpent = 624.95;
		double yenEchangeRate ;
		double euroExchangeRate;


        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
        // code goes below here
		Scanner peso = new Scanner(System.in);
		System.out.print("What is the exchange rate of 1 peso to 1 USD: ");
		pesoExchangeRage = peso.nextDouble();
		pesoToDollar = pesosSpent * pesoExchangeRage;


        // convertion for Japanese yen
        // code goes below here
		Scanner yen = new Scanner(System.in);
		System.out.print("What is the exchange rate of 1 Yen to 1 USD: ");
		yenEchangeRate =yen.nextDouble();
		yenToDollar = yenSpent * yenEchangeRate;

        // convertion for Euros
        // code goes below here
		Scanner euro= new Scanner(System.in);
		System.out.print("What is the exchange rate of 1 Euro to 1 USD: ");
		euroExchangeRate = euro.nextDouble();
		euroToDollar = euroSpent * euroExchangeRate;


        //print output to the screen
        // code goes below here
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Starting US dollars:		" + startingUsDollars);
		System.out.println("US dollars spent in Mexico:	" + pesoToDollar);
		System.out.println("US dollars spent in Japan:	" + yenToDollar);
		System.out.println("US dollars spent in France:	" + euroToDollar);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Remaining US dollars:		" + (startingUsDollars - pesoToDollar - yenToDollar - euroToDollar));
		System.out.println();
		System.out.println();


		// Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 0; 						//how many items can be purchased
		double fundsRemaining1 = 0.0;  				//how much of the budget is left

		//Calculations for item 1
		totalItem1 = budget1 / costItem1;
		fundsRemaining1 = budget1 % costItem1;

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = 0; 							//how many items can be purchased
		double fundsRemaining2 = 0.0;  					//how much of the budget is left

		totalItem2 = budget2 / (int)(costItem2 + .5);
		fundsRemaining2 = budget2 % costItem2;

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

