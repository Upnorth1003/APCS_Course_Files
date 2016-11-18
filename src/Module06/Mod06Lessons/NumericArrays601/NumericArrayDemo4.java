package Module06.Mod06Lessons.NumericArrays601;

/**
 * Tyler
 * 11/3/2016
 */
public class NumericArrayDemo4
    {

        public static void main(String[] args)
            {

                int [] intValues = {5, 6, -12, 73, 4, -25, 15, 8, 0, -2};
                int sum = 0;
                for (int index = 0; index <= 9; index++)
                    sum += intValues[index];
                System.out.println("Sum = " + sum);

            }

    }
