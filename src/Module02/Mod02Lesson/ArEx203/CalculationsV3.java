package Module02.Mod02Lesson.ArEx203;
/*
* Tyler Spurr
* 09/12/16
* CalculationsV3
*/
public class CalculationsV3
    {
        public static void main(String[ ] args)
            {

                int iNum1 = 25;
                int iNum2 = 9;


                // Addition
                System.out.println("Addition");
                System.out.print( iNum1 + " plus " + iNum2 + " = ");
                System.out.println(iNum1 + iNum2);
                System.out.println( 43.21 + 3.14 );
                System.out.println();



                // Subtraction
                System.out.println("Subtraction");
                System.out.println("16 - 9 - 25 = " + (16 - 9 - 25));
                System.out.println("3.14 - 5.0 = " + (3.14 - 5.0));
                System.out.println();


                // Multiplication
                System.out.println("Multiplication");
                System.out.println("25 * 9 = " + (25 * 9));
                System.out.println("3.14 * 5.0 * 5.0 = " + (3.14 * 5.0 * 5.0));
                System.out.println();


                // Division
                System.out.println("Division");
                System.out.println("9 / 25 = " + (9 / 25));
                System.out.println("43.21 / 5.0 = " + (43.21 / 5.0));
                System.out.println();



                // Modulus operator
                System.out.println("Modulus");
                System.out.println("16 % 9 = " + (16 % 9));
                System.out.println("5.0 % 3.14 = " + (5.0 % 3.14));
                System.out.println();



                // 2.02 Lab Equations
                System.out.println("2.02 Lab Equations");
                System.out.println();

                // 15 divided by 2.5 times -2 plus 10 / 5
                System.out.println("15 divided by 2.5 times -2 plus 10 / 5 = " + (15/2.5 * -2 + 10/5));
                //The + between the equation and the statement means oncatenation, NOT addition.
                System.out.println();


                // 234 minus (234 divided by 6 modulus 12) + 3
                System.out.println("234 minus (234 divided by 6 modulus 12) + 3 = " + (234 - (234 / 6 % 12) + 3));
                System.out.println();


                // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
                System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) = " + ((46.2/11) - 3 + 24 % (17 - 2 * 3)));
                System.out.println();


                // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
                System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 = " + (480/10/12 + 200 * .5 - 20 % 8));
                System.out.println();


                // 2.03 Additional int Equations



                //2.04 Additional double Equations



            }
        // end of main method
    }
