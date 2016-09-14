package Module02.Mod02Assignments.Assing204;

/**
 * Tyler Spurr
 * 9/14/2016
 * Program was to teach me about how to use the integers command and doubles command in java.
 */
public class CalculationsV5
    {
        public static void main(String[ ] args)
            {

                int iNum1 = 25;
                int iNum2 = 9;
                int iNum3 = 16;

                double dNum1 = 43.21;
                double dNum2 = 3.14;
                double dNum3 = 5.0;



                // Addition
                System.out.println("Addition");
                System.out.print( iNum1 + " plus " + iNum2 + " equals ");
                System.out.println(iNum1 + iNum2);
                System.out.print( dNum1 + " plus " + dNum2 + " equals ");
                System.out.println( dNum1 + dNum2 );
                System.out.println();



                // Subtraction
                System.out.println("Subtraction");
                System.out.print(iNum3 + " minus " + iNum2 + " minus " + iNum1 + " equals ");
                System.out.println(iNum3 - iNum2 - iNum1);
                System.out.print( dNum2 + " minus " + dNum3 + " equals ");
                System.out.println(dNum2 - dNum3);
                System.out.println();


                // Multiplication
                System.out.println("Multiplication");
                System.out.print(iNum1 + " times " + iNum2 + " equals ");
                System.out.println(iNum1 + iNum2);
                System.out.print(dNum2 + " times " + dNum3 + " times " + dNum3 + " equals ");
                System.out.println(dNum2 * dNum3 * dNum3);
                System.out.println();


                // Division
                System.out.println("Division");
                System.out.print(iNum2 + " divided by " + iNum1 + " equals ");
                System.out.println(iNum2 / iNum1);
                System.out.print(dNum1 + " divided by " + dNum3 + " equals ");
                System.out.println(dNum1 / dNum3);
                System.out.println();



                // Modulus operator
                System.out.println("Modulus");
                System.out.print(iNum3 + " modulus " + iNum2 + " equals ");
                System.out.println(iNum3 % iNum2);
                System.out.println(dNum3 + " modulus " + dNum2 + " equals ");
                System.out.println(dNum3 % dNum2);
                System.out.println();



                // 2.02 Lab Equations
                System.out.println("2.02 Lab Equations");

                // 15 divided by 2.5 times -2 plus 10 / 5
                System.out.println("    15 divided by 2.5 times -2 plus 10 / 5 = " + (15/2.5 * -2 + 10/5));
                //The + between the equation and the statement means oncatenation, NOT addition.


                // 234 minus (234 divided by 6 modulus 12) + 3
                System.out.println("    234 minus (234 divided by 6 modulus 12) + 3 = " + (234 - (234 / 6 % 12) + 3));


                // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
                System.out.println("    (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) = " + ((46.2/11) - 3 + 24 % (17 - 2 * 3)));


                // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
                System.out.println("    480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 = " + (480/10/12 + 200 * .5 - 20 % 8));
                System.out.println();

                // 2.03 Additional int Equations
                System.out.println("2.03 Additional int Equations");

                int nOne = 12;
                int nTwo = 6;
                int nThree = 27;
                int nFour = 3;

                System.out.print("  (" + nOne + " plus " + nTwo + ")" + " divided by " + nFour + " multiplied " + nTwo + " equals ");
                System.out.println((nOne + nTwo) / nFour * nTwo);

                System.out.print("  (" + nThree + " minus " + nFour + ")"+ " times " + nFour + " modulus " + nTwo);
                System.out.println((nThree - nFour) * nFour % nTwo);
                System.out.println();


                //2.04 Additional double Equations
                System.out.println("2.04 Additional double Equations");

                double dOne = 2.34;
                double dTwo = 34.5;
                double dThree = 45.6;
                double dFour = 8.7;

                System.out.print("  (" + dOne + " plus " + dTwo + " minus " + dFour + ") times " + dOne + " equals ");
                System.out.println((dOne + dTwo - dFour) * dOne);

                System.out.print("  (" + dOne + " divided by  " + dTwo + " plus " + dFour + ") modulus " + dThree + " equals ");
                System.out.println((dOne / dTwo + dFour) % dThree);



            }
    }
