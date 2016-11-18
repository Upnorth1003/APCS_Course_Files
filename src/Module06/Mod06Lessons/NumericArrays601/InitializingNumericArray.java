package Module06.Mod06Lessons.NumericArrays601;

/**
 * Tyler
 * 11/3/2016
 */
public class InitializingNumericArray
    {

        public static void main(String [] args)
            {
                int [] intValues;
                intValues = new int[10];
                for(int n = 0; n <= 9; n++)
                    {
                        System.out.println("index position " + n + " = "
                                + intValues[n]);
                    }
            }

    }
