package Module07.Mod07Assignments.DefiningNewMethods704;
/**
 * Description for 7.04 WeightOnPlanetsV1 project
 * Calculate persons gravity on a planet
 *
 * @author Tyler Spurr
 * @version 11/18/2016
 */
import javax.net.ssl.SSLContext;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetsV1
{
    // write static methods here
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
	public static double[] getGravity()throws IOException
		{
			File filename = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module07\\Mod07Lessons\\DeclaringNewMethods703\\gravities.txt");
			Scanner inFile = new Scanner(filename);
			double[] gravity = new double[9];
			while (inFile.hasNext())
				{
					for (int i = 0; i < gravity.length; i++)
						gravity[i] = inFile.nextDouble();
				}
			return gravity;
		}

	public static double[] calcWeight(double weight, double[] gravity)
		{

			double[] mass = new double[9];
			double[] newWeight = new double[9];
			for (int i= 0; i < mass.length; i++)
				{
					newWeight[i] = weight / 9.79 * gravity[i];
				}

			return newWeight;
		}
	public static void printResults(String[] names, double[] gravity, double[] weight)
		{
			System.out.println("\t\tPlanetary Weight");
			System.out.printf("%-10s %-12s %-8s\n", "Planet", "Gravity", "Weight");
			System.out.println("-----------------------------------------------------");
			for (int i = 0; i < 9; i++)
				System.out.printf("%-10s %-12.2f %-8.2f\n", names[i], gravity[i], weight[i]);
		}


    public static void main(String[] args)throws IOException
	{

		Scanner in = new Scanner(System.in);
		// Extension idea... instead of hard codeing the weight, you may propt the user for input.
		System.out.print("Please enter in your weight: ");
		double earthWeight = in.nextInt();
		System.out.println();

		//double earthWeight = 100.0; // initalize Earth weight to 100 lbs.

		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] gravity = getGravity(); 							// static method you write
		double[] weight = calcWeight(earthWeight, gravity);  // static method you write
		printResults(names, gravity, weight); 					// static method you write

    } //end main
}//end class