package Module06.Mod06Assignments.WeatherData603;
/**
 * Heat Index description:
 * Use arrays and for-each loops to determine heat index in West Keys, Florida.
 * @author: Tyler Spurr
 * @version: 11/6/16
 *
 */

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars

        String location = "Key West, Florida";
        File fileNameTemp = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module06\\Mod06Assignments\\WeatherData603\\KeyWestTemp.txt");
        File fileNameHumid = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module06\\Mod06Assignments\\WeatherData603\\KeyWestHumid.txt");
        File fileNamehI = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module06\\Mod06Assignments\\WeatherData603\\KeyWestHI.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);
        PrintWriter outFile = new PrintWriter(fileNamehI);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n] + "x"); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
            humidity[n] = inFileHumid.nextInt( );
            //System.out.println (humidity[n] + "h");  //debug statement - uncomment to see values assignned to humidity
            n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

		double x = 0.0;
		double h = 0.0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
                x = temperature[n];
            	h = humidity[n] / 100;

                hI[n] = - 42.379
                        + 2.04901523 * x
                        + 10.14333127 + h
                        - 0.22475541 * x * h
                        - 6.83783E-3 * Math.pow(x, 2)
                        - 5.481717E-2 * Math.pow(h, 2)
                        + 1.22874E-3 * Math.pow(x, 2) * h
                        + 8.5282E-4 * Math.pow(h, 2) * x
                        - 1.99E-6 * Math.pow(x, 2) * Math.pow(h, 2); 	//complete formula found in lecture notes
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
            {
        	    tempSum += temperature[n];
            }
        for(n =0 ; n < humidity.length; n++)
            {
                humidSum += humidity[n];
            }
        for(n = 0; n < hI.length; n++)
            {
                hISum += hI[n];
            }

        double tempAvg = tempSum/(double)temperature.length;
        double humidAvg = humidSum/(double)humidity.length;
        double hIAvg = hISum/(double)hI.length;


        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();


        System.out.printf("%50s", "Months");
        System.out.println();
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("%6.3s", m);
        }


        System.out.println("  Avg");
        System.out.println("******************************************************************************************");


        System.out.print("Temp (F)    ");
         //for:each loop to print temperature
        for(double t : temperature)
            {
                System.out.printf("%6.4s", t);
            }

		//print average
        System.out.printf("%6.4s", tempAvg);
        System.out.println();

        System.out.print("Humidity (%)");
        //for:each loop to print humidity
        for(int hum : humidity)
            {
                System.out.printf("%6d", hum);
            }
        System.out.printf("%6.4s", humidAvg);
        System.out.println();

        System.out.print("HI (F)      ");
        //for:each loop to print HI
        for(double heat : hI)
            {
                System.out.printf("%6.4s" , heat);
                outFile.printf("%6.4s" , heat);
            }
        outFile.close();
        System.out.printf("%6.4s", hIAvg);
        System.out.println();



    } //end main()

}//end HeatIndex
