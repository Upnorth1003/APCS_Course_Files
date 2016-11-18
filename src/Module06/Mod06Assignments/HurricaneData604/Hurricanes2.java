package Module06.Mod06Assignments.HurricaneData604; /**
 * Hurricane description:
 * Use arrays and printf statements and a bunch of other stuff to print out a chart of hurricanes from 1980 - 2006
 * @author: Tyler Spurr
 * @version: 11/7/16
 *
 */


import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.rotateLeft;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables


		int arrayLength = 59;
        int [] year = new int[arrayLength];
        int [] windSpeedK = new int[arrayLength];
        double [] windSpeedM = new double[arrayLength];
        int [] pressure = new int[arrayLength];
        String [] month = new String[arrayLength];
        String [] name = new String[arrayLength];
        int [] category = new int[arrayLength];
        int [] categorySum = new int[arrayLength];
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;


        File filename2 = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module06\\Mod06Assignments\\HurricaneData604\\Summary.txt");
        File fileName = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module06\\Mod06Assignments\\HurricaneData604\\hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter(filename2);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeedK[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();


		//PROCESSING - calculate and convert values
		// convert windspeed from knots to MPH
        for(index = 0; index < windSpeedK.length; index++)
            {
                windSpeedM[index] = windSpeedK[index] * 1.15078;

                if((windSpeedM[index] >= 74.0) && (windSpeedM[index] <= 95.0))
                    {
                        category[index] = 1;
                        categorySum[0]++;
                    }else if((windSpeedM[index] >= 96.0) && (windSpeedM[index] <= 110.0))
                    {
                        category[index] = 2;
                        categorySum[1]++;
                    }else if((windSpeedM[index] >= 111) && (windSpeedM[index] <= 129))
                    {
                        category[index] = 3;
                        categorySum[2]++;
                    }else if((windSpeedM[index] >= 130) && (windSpeedM[index] <= 156))
                    {
                        category[index] = 4;
                        categorySum[3]++;
                    }else if(windSpeedM[index] >= 157)
                    {
                        category[index] = 5;
                        categorySum[4]++;
                    }
            }
		// determine category


        //Find min, max and average for category, windspeed and pressure
        int maxC = MIN_VALUE;
        double maxW = Double.MIN_VALUE;
        int maxP = MIN_VALUE;
        int minC = MAX_VALUE;
        double minW = Double.MAX_VALUE;
        int minP = MAX_VALUE;
        int averageC = 0;
        int sumC = 0;
        double averageW = 0.0;
        double sumW = 0.0;
        double averageP = 0;
        int sumP = 0;

        for(int i = 0; i < name.length; i++)
            {
                if(category[i] > maxC)
                    maxC = category[i];
                if(category[i] < minC)
                    minC = category[i];

                if(windSpeedM[i] > maxW)
                    maxW = windSpeedM[i];
                if(windSpeedM[i] < minW)
                    minW = windSpeedM[i];

                if(pressure[i] > maxP)
                    maxP = pressure[i];
                if(pressure[i] < minP)
                    minP = pressure[i];

                sumC += category[i];
                sumP += pressure[i];
                sumW += windSpeedM[i];
            }

        averageC = (sumC/category.length);
        averageP = sumP/pressure.length;
        averageW = sumW/windSpeedM.length;


        //Output - print table using printf to format the columns


        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");

        for(index = 0; index < year.length; index++)
            {
                System.out.printf("%-6d\t %-13s\t %-10d\t %-15d\t %-6.2f\n",
                        year[index], name[index], category[index], pressure[index], windSpeedM[index]);
            }

        System.out.println("=====================================================================");


        System.out.printf("%-22s\t %-11d %-15.0f\t %-6.0f\n",
                "Average ", averageC, averageP, averageW);

        System.out.printf("%-22s\t %-11d %-15d\t %-6.0f\n",
                "Maximum ", maxC, maxP, maxW);

        System.out.printf("%-22s\t %-11d %-15d\t %-6.0f\n",
                "Minimum ", minC, minP, minW);
        System.out.println();

        for(index = 0; index < 5; index++)
            System.out.printf("%s %d %s %d\n", "Number in Category", (index + 1), ": " , categorySum[index]);



        //Out to file
        outFile.printf("%-22s\t %-11d %-15.0f\t %-6.0f\n",
                "Average ", averageC, averageP, averageW);

        outFile.printf("%-22s\t %-11d %-15d\t %-6.0f\n",
                "Maximum ", maxC, maxP, maxW);

        outFile.printf("%-22s\t %-11d %-15d\t %-6.0f\n",
                "Minimum ", minC, minP, minW);
        outFile.println();

        for(index = 0; index < 5; index++)
            outFile.printf("%s %d %s %d\n", "Number in Category", (index + 1), ": " , categorySum[index]);

        outFile.close();
    }//end main()
}//end Module06.Mod06Assignments.HurricaneData604.Hurricanes2
