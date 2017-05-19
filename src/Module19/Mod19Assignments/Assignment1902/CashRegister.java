package Module19.Mod19Assignments.Assignment1902;

/**
 * @author Tyler
 * @version 4/17/2017
 * @purpose
 */
public class CashRegister
    {

        private int cashOnHand;

        public CashRegister()
            {
                cashOnHand = 500;
            }

        public CashRegister(int cashOnHand)
            {
                if (cashOnHand < 0)
                    {
                        throw new IllegalArgumentException("Cash on hand cannot be less than 0");
                    }
                else
                    {
                        this.cashOnHand = cashOnHand;
                    }
            }

        public void acceptAmount(int money)
            {
                if (money > 0)
                    {
                        cashOnHand += money;
                    }
                else
                    {
                        throw new IllegalArgumentException("Accept money not spending it");
                    }
            }

        public int getCashOnHand()
            {
                return cashOnHand;
            }



    }
