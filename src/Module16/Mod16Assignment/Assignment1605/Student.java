package Module16.Mod16Assignment.Assignment1605;

/**
 * @author Tyler
 * @version 3/25/2017
 * @purpose
 */
public class Student
    {

        private String name;
        private int qz1, qz2, qz3, qz4, qz5;
        private int[] quizes = new int[5];


        public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
            {
                this.name = name;
                this.qz1 = qz1;
                this.qz2 = qz2;
                this.qz3 = qz3;
                this.qz4 = qz4;
                this.qz5 = qz5;

                quizes[0] = qz1;
                quizes[1] = qz2;
                quizes[2] = qz3;
                quizes[3] = qz4;
                quizes[4] = qz5;
            }

        public int getQuiz(int quiz)
            {
                return quizes[quiz - 1];
            }

        public void setQuiz(int quiz, int grade)
            {
                quizes[quiz - 1] = grade;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getName()
            {
                return name;
            }

        public String toString()
            {
                return name + " got " + qz1+ ", " + qz2 + ", " + qz3 + ", " + qz4 + ", and "+ qz5 + " on their quizes.";
            }
    }
