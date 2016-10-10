package Module04.Mod04Assignments.BodyMassIndex405;

import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/5/16
 * Write a program to calculate Body Mass Index (BMI) given a person’s height and
 * weight.
 */
public class BMI
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);

                System.out.print("Enter your name (first last): ");
                String firstName = in.next();
                String lastName = in.next();

                System.out.print("Enter your weight in pounds: ");
                int weightLb = in.nextInt();

                System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
                int heightFeet = in.nextInt();
                int heightInches = in.nextInt();

                System.out.println();
                System.out.println("Body Mass Index Calculator");
                System.out.println("==========================");

                System.out.println("Name: " + firstName + " " + lastName);

                heightInches += heightFeet * 12;
                double heightMeters = heightInches / 39.3701;
                System.out.println("Height(m): " + heightMeters);

                double weightKg = weightLb / 2.20462;

                System.out.println("Weight(kg): " + weightKg);

                double bmi = weightKg / (heightMeters * heightMeters);
                System.out.println("BMI: " + bmi);

                boolean overWeight = bmi >= 25.0 && bmi <= 29.9;
                boolean underWeight = bmi < 18.5;
                boolean normal = bmi >= 18.5 && bmi <= 24.9;
                boolean obese = bmi > 30.0;

                if (overWeight){

                    System.out.println("Category: Over Weight");

                }else if (underWeight){

                    System.out.println("Category: Under Weight");

                }else if (normal){

                    System.out.println("Category: Normal Weight");

                }else if (obese){

                    System.out.println("Category: Obese");

                }

            }

    }
