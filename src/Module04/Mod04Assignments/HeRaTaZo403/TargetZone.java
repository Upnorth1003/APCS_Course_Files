

import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/3/16
 * Purpose of the program is to calculate a persons heart
 * rate based on their age, resting heart rate, and heart
 * rate after exercise.
 */
public class TargetZone
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);
                int age;
                int restingHeartRate;      //Resting Heart rate
                int hRateEx;               //Heart rate afterexercising
                double maxHeartRate;
                double heartRateReserve;
                int lowEnd;
                int highEnd;


                System.out.print("Enter your age: " );
                age = in.nextInt();


                System.out.print("Enter your resting heart rate: ");
                restingHeartRate = in.nextInt();

                System.out.print("Enter your hear rate after exercising: ");
                hRateEx= in.nextInt();

                System.out.println();

                maxHeartRate = 206.9 - (0.67 * age);
                heartRateReserve = maxHeartRate - restingHeartRate;
                lowEnd = (int)((heartRateReserve * 0.65) + restingHeartRate);
                highEnd = (int)((heartRateReserve * 0.85) + restingHeartRate);

                System.out.println("Your heart rate target zone is between " + lowEnd + " and " + highEnd);

                if(hRateEx > highEnd){

                    System.out.println("After exercising, your heart rate is ABOVE your target zone");

                }else if(hRateEx < lowEnd){

                    System.out.println("After exercising, your heart rate is BELOW your target zone");

                }else if(hRateEx < highEnd && hRateEx > lowEnd){

                    System.out.println("After exercising, your heart rate is ACCURATE with your target zone");

                }
            }

    }
