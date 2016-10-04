package Module04.Mod04Assignments.BasalMetabolicRate404;
import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/4/16
 * Calculate the BMR of men and women using boolean .charAT() and if else statement.
 */
public class BMR
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);

                System.out.print("Enter your name: ");
                String name = in.next();

                System.out.print("Gender (M or F): ");
                String genderInput = in.next();
                char gender = genderInput.charAt(0);

                System.out.print("Enter your age: ");
                int age = in.nextInt();

                System.out.print("Height in inches: ");
                int heightIn = in.nextInt();

                System.out.print("Weight in Pounds: ");
                int weightLb = in.nextInt();

                System.out.println();
                System.out.println();
                System.out.println("Calculation of Your Basal Metabolism");
                System.out.println();

                double heightCm = heightIn * 2.54;
                double weightKg = weightLb * .453529;
                boolean men = gender == 'M';

                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Age: " + age);
                System.out.println("Weight (kg); " + weightKg);
                System.out.println("Height (cm): " + heightCm);

                if(men) {

                    double bmrMen = ((13.397 * weightKg) + (4.799 * heightCm) - (5.677 * age) + 88.362);
                    System.out.println("Basal Metabolic Rate: " + bmrMen + " calories per day");

                }else {

                    double bmrWomen = ((9.247 * weightKg) + (3.098 * heightCm) - (4.330 * age) + 447.593);
                    System.out.println("Basal Metabolic Rate: " + bmrWomen + " calories per day");

                }

            }

    }
