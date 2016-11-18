package Module07.Mod07Lessons.DeclaringNewMethods703;
/**
 * Description for 7.03 Gravity
 *
 * @author (Your Name)
 * @version (The Date)
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Gravity
{
	// calcGravity returns an array of doubles containing teh gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double calcGravity(double radius, double mass)
	{
		// fill in code here
		// The formula to calculate gravity is:
		return (6.67E-17 * mass) / Math.pow(radius,2);
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared

	}

	// printResults will print the table to output screen
	// return type is voide because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
		System.out.println("\t\t\t\tPlanetary Data");
		System.out.printf("%-10s %-18s %-13s %-6s\n", "Planet", "Diameter (kg)", "Mass (kg)", "g (m/s^2)");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < 9; i++)
			System.out.printf("%-10s %-17.0f %-15.9s %1.2f\n", name[i], (2 * radius[i]), mass[i], gravity[i]);


	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity, String[] name)throws IOException
	{
		File filename = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module07\\Mod07Lessons\\DeclaringNewMethods703\\gravities.txt");
		PrintWriter outFile = new PrintWriter(filename);


		for (int i = 0; i < 9; i++)
			outFile.println(gravity[i]);
		outFile.close();

	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};
        double[] gravities = new double[names.length];
		// or using big E notation:
		// double [] mass = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22}; // See IMACS double lesson for big E notation

		// Processing
		for (int i = 0; i < names.length; i++)
				gravities[i] = calcGravity(radii[i], masses[i]);


		// Output
		printResults(names, radii, masses, gravities);
		printToFile(gravities, names);


    } //end main
}//end class