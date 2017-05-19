package Module19.Mod19Assignments.Assignment1902;

/**
 * @author Tyler
 * @version 4/17/2017
 * @purpose
 */
public class Dispenser
    {

        private int numberOfItems, cost;

        public Dispenser()
            {
                numberOfItems = 50;
                cost = 50;
            }

        public Dispenser(int numberOfItems, int cost)
            {
                if (numberOfItems < 0)
                    {
                        throw new IllegalArgumentException("Number of items cannot be below 0");
                    }
                else
                    {
                        this.numberOfItems = numberOfItems;
                    }

                if (cost < 0)
                    {
                        throw new IllegalArgumentException("Cost cannot be below 0");
                    }
                else
                    {
                        this.cost = cost;
                    }
            }

        public int getCount()
            {
                return numberOfItems;
            }
        public int getProductCost()
            {
                return cost;
            }
        public void makeSale()
            {
                numberOfItems = numberOfItems - 1;
            }

    }
