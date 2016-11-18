package Module06.Mod06Assignments.WeatherData601;
/**
 * Annual Climate description:
 *
 * @author: Tyler Spurr
 * @version: 11/3/16
 *
 */

import java.util.Scanner;
class AnnualClimate
{

   	public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Apalachicola";
		String state = "FL";
		double average;
		double sum1 = 0;
		double sum2 = 0;
		double annual;

		String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double temperature [] ={52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2}; 		//initialize with Fahrenheit values
		double precipitation [] ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5}; 	//initialize with inches values

		String tempLabel = "(F)";   //initialize to F
		String precipLabel = "(in)"; //initialize to cm


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
				temperature[index] = (temperature[index] - 32) * 5 / 9;
			}

		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";
			for( int index = 0; index < temperature.length; index++)
			{
				precipitation[index] = precipitation[index] * 2.54;
			}
		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		for(int index = 0; index < temperature.length; index++)
			{
				System.out.printf("%-10s %10.1f %23.1f", month[index], temperature[index], precipitation[index] );
				System.out.println();
				sum1 += temperature[index];
				sum2 += precipitation[index];
			}
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();

		annual = sum2 / 12;
		average = sum1 / 12;
		System.out.printf("%16s %2.1f %19s %2.1f", "Average: ", average,"Annual: ", annual);






	}//end main
}//end Annual Climate
