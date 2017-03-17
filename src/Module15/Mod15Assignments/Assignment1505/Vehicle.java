package Module15.Mod15Assignments.Assignment1505;

/**
 * @author Tyler
 * @version 3/12/2017
 * @purpose
 */
public class Vehicle implements Product
    {
        private String name;
        private double cost;

        public Vehicle(String name, double cost)
            {
                this.name = name;
                this.cost = cost;
            }

        @Override
        public double getCost()
            {
                return cost;
            }

        @Override
        public String getName()
            {
                return name;
            }
    }
