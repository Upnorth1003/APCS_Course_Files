package Module19.Mod19Assignments.Assignment1902;

/**
 * @author Tyler
 * @version 4/17/2017
 * @purpose testing throw exceptions
 */
public class CandyMachine
    {

        public static void main(String[] args)
            {
                Dispenser dispenser = new Dispenser(100, 25);
                CashRegister money = new CashRegister(400);
                sellProduct(dispenser, money);
            }

        public static void sellProduct(Dispenser dispenser, CashRegister money)
            {
                if(dispenser.getCount() != 0 && ((double)dispenser.getProductCost() / (double)money.getCashOnHand()) > 0)
                    {
                        System.out.println("Get your candy at the bottom and enjoy!");
                    }
                else
                    {
                        System.out.println("You do not have enough money or they ran out of candy.");
                    }
            }

    }
