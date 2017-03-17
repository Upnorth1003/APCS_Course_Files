package Module15.Mod15Assignments.Assignment1505;

/**
 * @author Tyler
 * @version 3/12/2017
 * @purpose
 */
public class Tool implements Product, Comparable<Tool>
    {

        private String name;
        private double cost;

        public Tool(String name, double cost)
            {
                this.name = name;
                this.cost = cost;
            }


        @Override
        public String getName()
            {
                return name;
            }

        @Override
        public double getCost()
            {
                return cost;
            }

        public int compareTo(Tool obj)
            {
                if (cost == obj.cost)
                    return 0;
                else if (cost < obj.cost)
                    return -1;
                else
                    return 1;
            }
    }
