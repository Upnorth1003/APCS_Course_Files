package Module03.Mod03Assignments.AgeCalculator308;
/**
 * The purpose of this program is to calculate your age in minutes
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 06/01/08
 *
 * @Modified Tyler Spurr
 * @Date 9/27/16
 */
import java.util.Scanner;
public class AgeCalculatorV2
    {
        public static void main(String[] args)
            {
                //User Input
                Scanner in = new Scanner(System.in);
                String firstName;

                //Asking for name
                System.out.print("Please enter your name (first last): ");
                firstName = in.next();
                String lastName = in.nextLine();
                System.out.println();

                //User Age
                System.out.print("Please enter your age in years: ");
                String userAge = in.next();
                int ageInYears = Integer.parseInt(userAge);

                //Math
                double approxAgeInDays = ageInYears * 365.25;
                int ageInHours = (int)approxAgeInDays * 24;
                int ageInMinutes = ageInHours * 60;

                String firstInitial = firstName.substring(0,1);
                String capsLastName = lastName.toUpperCase();
                String name = firstInitial  + ". " + capsLastName;

                System.out.println("Name: " + name);
                System.out.print("\t\tAge in Minutes: " + ageInMinutes + "\n");
            }
    }
