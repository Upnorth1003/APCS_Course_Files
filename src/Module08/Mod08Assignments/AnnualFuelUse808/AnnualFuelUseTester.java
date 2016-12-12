package Module08.Mod08Assignments.AnnualFuelUse808;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Tyler
 * 12/11/2016
 */
public class AnnualFuelUseTester
    {

        public static void main(String[] args)
            {
                int maxDistance = MIN_VALUE,
                        minDistance = MAX_VALUE,
                        distSum = 0,
                        daySum =0;
                double maxMPG = Double.MIN_VALUE,
                        minMPG = Double.MAX_VALUE,
                        maxPrice = Double.MIN_VALUE,
                        mpgSum = 0.0,
                        galSum = 0.0,
                        costSum = 0.0,
                        minPrice = Double.MAX_VALUE;


                //Making Object Array
                AnnualFuelUse[] fillUp = {new AnnualFuelUse(148095, 148225, 1.839, 10.99, 1),
                        new AnnualFuelUse(148225, 148400, 1.819, 10.668, 11),
                        new AnnualFuelUse(148400, 148557, 1.979, 10.952, 23)};

                //Finding Max and Min distance, while at the same time getting distance sum and day sum.
                for (int i = 0; i < fillUp.length; i++)
                    {
                        //Max and Mins
                            //Distance
                        if (fillUp[i].calcDistance() > maxDistance)
                            maxDistance = fillUp[i].calcDistance();
                        if (fillUp[i].calcDistance() < minDistance)
                            minDistance = fillUp[i].calcDistance();
                            //MPG
                        if (fillUp[i].getMPG() > maxMPG)
                            maxMPG = fillUp[i].getMPG();
                        if (fillUp[i].getMPG() < minMPG)
                            minMPG = fillUp[i].getMPG();
                            //Price
                        if (fillUp[i].getPPG() > maxPrice)
                            maxPrice = fillUp[i].getPPG();
                        if (fillUp[i].getPPG() < minPrice)
                            minPrice = fillUp[i].getPPG();

                        //Summing
                        distSum += fillUp[i].calcDistance();
                        galSum += fillUp[i].getGallons();
                        mpgSum += fillUp[i].getMPG();
                        costSum += fillUp[i].getCost();
                        if (i > 0)
                            {
                                int holder = fillUp[i].getDays() - fillUp[i-1].getDays();
                                daySum += holder;
                            }
                    }

                //Calculating Annual
                    //Fills
                double averageDays = daySum / fillUp.length;
                double annualFilling = 365 / averageDays;
                    //Distance
                double averageDist = distSum / fillUp.length;
                double annualDist = averageDist * annualFilling;
                    //Gallons
                double averageGallons = galSum / fillUp.length;
                double annualGallons = averageGallons * annualFilling;
                    //MPG
                double avergeMPG = mpgSum / fillUp.length;
                double annualMPG = avergeMPG * annualFilling;
                    //Cost
                double averageCost = costSum / fillUp.length;
                double annualCost = averageCost * annualFilling;


                //Printing Everything out
                System.out.printf("%s %s %s %s %s %s %s %s %s\n", "Fill Up", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price", "Cost");
                for (int i = 0; i < fillUp.length; i++)
                    {
                        fillUp[i].printLine(i+1);
                    }



            }

    }
