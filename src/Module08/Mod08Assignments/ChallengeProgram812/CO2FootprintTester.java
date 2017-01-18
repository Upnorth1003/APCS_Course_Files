package Module08.Mod08Assignments.ChallengeProgram812;

import java.util.ArrayList;

/**
 * @author Tyler Spurr
 * @version 12/19/2016
 * @purpose Calculates the CO@ footprint of someone, in the arraylist of individuals
 */
public class CO2FootprintTester
    {

        public static void main(String[] args)
            {
                ArrayList<CO2Footprint> individuals = new ArrayList<CO2Footprint>();
                    //adding people to individuals Array
                individuals.add(new CO2Footprint(566.79, 227.29, 0.08, 5, true, true, false, true, 5 ));
                individuals.add(new CO2Footprint(762.23, 275.52, 0.06, 1, true, false, false, true, 5 ));
                individuals.add(new CO2Footprint(4573.58, 305.26, 0.10, 6, true, true, true, true, 20));

                System.out.println("|            Pounds of CO2            |        Pounds of CO2       |                 |");
                System.out.println("|             Emitted From            |         Reduced from       |                 |");
                System.out.println("|    Gas    |  Electricity  |  Waste  |  Recycling   |  New Bulbs  |  CO2 Footprint  |");
                System.out.println("|-----------|---------------|---------|--------------|-------------|-----------------|");

                for (CO2Footprint datarecord : individuals)
                    {
                        datarecord.calcBulbReduction();
                        datarecord.calcElectricityCO2();
                        datarecord.calcGrossWasteEmission();
                        datarecord.calcWasteReduction();
                        datarecord.calcNetWasteReduction();
                        datarecord.polutionFromGas();
                        datarecord.printOut();
                    }



            }

    }
