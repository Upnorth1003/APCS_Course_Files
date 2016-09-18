package Module02.Mod02Assignments.Grades207;

/**
 * Tyler Spurr
 * 9/18/2016
 * program was to show my knowledge of interchanging doubles and intergers
 */
public class GradesV2
    {

        public static void main(String[] args)
            {

                int numTests = 0;           //counts the number of tests
                int testGrade = 0;          //individual test grade
                int totalPoints = 0;        //total points for all tests
                double average = 0.0;       //average grade

                //First test
                testGrade = 97;
                totalPoints += testGrade;
                numTests++;
                average = (double)totalPoints / numTests;
                System.out.print("n =" + numTests);
                System.out.print("  New Test Grade:  " + testGrade);
                System.out.print("  Total Points:  " + totalPoints);
                System.out.println("    Average Score:  " + average);


                //Second test
                testGrade = 79;
                totalPoints += testGrade;
                numTests++;
                average = (double)totalPoints / numTests;
                System.out.print("n =" + numTests);
                System.out.print("  New Test Grade:  " + testGrade);
                System.out.print("  Total Points:  " + totalPoints);
                System.out.println("    Average Score:  " + average);

                //Third test
                testGrade = 83;
                totalPoints += testGrade;
                numTests++;
                average = (double)totalPoints / numTests;
                System.out.print("n =" + numTests);
                System.out.print("  New Test Grade:  " + testGrade);
                System.out.print("  Total Points:  " + totalPoints);
                System.out.println("    Average Score:  " + average);

                //Third test
                testGrade = 88;
                totalPoints += testGrade;
                numTests++;
                average = (double)totalPoints / numTests;
                System.out.print("n =" + numTests);
                System.out.print("  New Test Grade:  " + testGrade);
                System.out.print("  Total Points:  " + totalPoints);
                System.out.println("    Average Score:  " + average);

            }

    }
