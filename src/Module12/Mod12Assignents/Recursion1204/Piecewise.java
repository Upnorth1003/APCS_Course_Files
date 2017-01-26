package Module12.Mod12Assignents.Recursion1204;

/**
 * @author Tyler
 * @version 1/23/2017
 * @purpose to use recursive methods to solve piecewise
 */
public class Piecewise
    {


        Piecewise()          //default constructor
        {
        }

        public int fOf(int x)
            {
                if (x <= 10)                        //the base case
                    {
                        System.out.println(x + " <= 10, therefore ... f(" + x + ") = -7");
                        return -7;
                    }
                else
                    {
                        System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 4) + 2 = f(" + (x -4) + ") + 2");
                        return fOf(x-4) + 2;
                    }
            }

        public int gOf(int x)
            {
                if (x <= 25)                        //the base case
                    {
                        System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
                        return 20;
                    }
                else
                    {
                        System.out.println(x + " > 25, therefore ... f(" + x + ") = f(" + x + "/12 + 5) - 3 = f(" + (x/12 +5) + ") - 3");
                        return gOf(x/12 + 5) -3;
                    }
            }

        public int hOf(int x)
            {
                if (x > 20)                        //the base case
                    {
                        System.out.println(x + " > 20, therefore ... f(" + x + ") = -100");
                        return -100;
                    }
                else
                    {
                        System.out.println(x + " <= 20, therefore ... f(" + x + ") = f(" + x + " * 2) - 4 = f(" + (x * 2) + ") - 4");
                        return hOf(x * 2) - 4;
                    }
            }

        public static void main(String[] args)
            {
                int x, ifState, condition;
                Piecewise function = new Piecewise();

                //Question 1
                x = 25;

                System.out.println("----------------Q1---------------");
                System.out.println("       f(x - 4) + 2    if x >  10");
                System.out.println("f(x) = ");
                System.out.println("       -7              if x <= 10");
                System.out.println("---------------------------------");
                System.out.println();

                System.out.println("f(" + x + ") = " + function.fOf(x));
                System.out.println();

                //Question 2
                x = 30;

                System.out.println("----------------Q2---------------");
                System.out.println("      f(x/12 + 5) - 3  if x >  25");
                System.out.println("f(x)= ");
                System.out.println("      20               if x <= 25");
                System.out.println("---------------------------------");
                System.out.println();

                System.out.println("f(" + x + ") = " + function.gOf(x));
                System.out.println();

                //Question 4
                x = 500;

                System.out.println("----------------Q4---------------");
                System.out.println("      f(x/12 + 5) - 3  if x >  25");
                System.out.println("f(x)= ");
                System.out.println("      20               if x <= 25");
                System.out.println("---------------------------------");
                System.out.println();

                System.out.println("f(" + x + ") = " + function.hOf(x));
                System.out.println();

            }

    }
