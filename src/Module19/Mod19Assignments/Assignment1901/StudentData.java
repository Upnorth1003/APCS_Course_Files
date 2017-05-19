package Module19.Mod19Assignments.Assignment1901;

/**
 * @author Tyler
 * @version 4/17/2017
 * @purpose testing and implementing error throwing
 */
public class StudentData
    {

        private String firstName, lastName;
        private double[] testScores;
        private char grade;

        public StudentData(String firstName, String lastName, double[] testScores)
            {
                if (!firstName.isEmpty())
                    {
                        this.firstName = firstName;
                    }
                else
                    {
                        throw new IllegalArgumentException("First name cannot be empty");
                    }

                if (!lastName.isEmpty())
                    {
                        this.lastName = lastName;
                    }
                else
                    {
                        throw new IllegalArgumentException("Last name cannot be empty");
                    }

                this.testScores = testScores;
            }

        public String getName()
            {
                return firstName + " " + lastName;
            }
        public String getTestScores()
            {
                String sTestScores = " ";
                for (int i = 0; i < testScores.length; i++)
                    {
                        sTestScores += testScores[i] + ", ";
                    }

                return sTestScores;
            }



        public char courseGrade(double[] list)
            {
                double sum = 0.0;
                for (int i = 0; i < list.length; i++)
                    {
                        sum += list[i];
                    }

                double average = sum / list.length;

                if (list.length == 0)
                    {
                        throw new IllegalArgumentException("Grades cannot be empty.");
                    }

                if (average >= 90.0)
                    {
                        return 'A';
                    }
                else if (average >= 80.0 && average < 90.0)
                    {
                        return 'B';
                    }
                else if (average >= 70.0 && average < 80.0)
                    {
                        return 'C';
                    }
                else if (average >= 60.0 && average < 70.0)
                    {
                        return 'D';
                    }
                else if (average >= 50.0 && average < 60.0)
                    {
                        return 'E';
                    }
                else
                    {
                        return 'F';
                    }
            }

        public String toString()
            {
                return String.format("%-15s", getName()) + String.format("%-40s", getTestScores()) + String.format("%s", courseGrade(testScores));
            }

    }
