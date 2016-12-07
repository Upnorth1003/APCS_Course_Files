package Module08.Mod08Assignments.Car807;

/**
 * Tyler Spurr
 * 12/7/2016
 * Calculates variable for cars reading into the CarV7.java file
 */
public class CarV7Tester
    {

        public static void main(String[] args)
            {

                CarV7 car1 = new CarV7("02 Ford Taurus", 148225, 148095, 10.952,  1.839);
                CarV7 car2 = new CarV7("02 Vol. Passat", 48286, 48000, 21.185, 1.949);
                CarV7 car3 = new CarV7("08 Chr. PTCurser", 100469, 100358, 11.547, 1.949);


                car1.printOut();
                car2.printOut2();
                car3.printOut2();

            }

    }
