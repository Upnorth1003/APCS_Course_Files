

import java.util.Scanner;

/**
 * Tyler Spurr
 * 10/10/16
 * Purpose of the program is to calculate a persons heart
 * rate based on their age, resting heart rate, and heart
 * rate after exercise.
 */
public class TargetZone
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);
                String age;
                String restingHeartRate;      //Resting Heart rate
                String hRateEx;               //Heart rate after exercising
                double maxHeartRate;
                double heartRateReserve;
                int lowEnd;
                int highEnd;


                System.out.print("Enter your age: " );
                age = in.next();


                System.out.print("Enter your resting heart rate: ");
                restingHeartRate = in.next();

                System.out.print("Enter your hear rate after exercising: ");
                hRateEx= in.next();

                System.out.println();

                maxHeartRate = 206.9 - (0.67 * Integer.parseInt(age));
                heartRateReserve = maxHeartRate - Integer.parseInt(restingHeartRate);
                lowEnd = (int)((heartRateReserve * 0.65) + Integer.parseInt(restingHeartRate));
                highEnd = (int)((heartRateReserve * 0.85) + Integer.parseInt(restingHeartRate));

                System.out.println("Your heart rate target zone is between " + lowEnd + " and " + highEnd);

                boolean aboveRate = Integer.parseInt(hRateEx) > highEnd;
                boolean belowRate = Integer.parseInt(hRateEx) < lowEnd;
                boolean accurateRate = Integer.parseInt(hRateEx) < highEnd && Integer.parseInt(hRateEx) > lowEnd;
                if(aboveRate){

                    System.out.println("After exercising, your heart rate is ABOVE your target zone");

                }else if(belowRate){

                    System.out.println("After exercising, your heart rate is BELOW your target zone");

                }else if(accurateRate){

                    System.out.println("After exercising, your heart rate is ACCURATE with your target zone");

                }
            }

    }
