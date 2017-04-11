package Module17.Mod17Assignments.Assignment1705;

/**
 * @author Tyler
 * @version 4/10/2017
 * @purpose
 */
public class Item
    {
        private int itemID, inStore;
        private String itemName;
        private double price;

        public Item(int itemID, String itemName, int inStore, double price)
            {
                this.itemID = itemID;
                this.inStore = inStore;
                this.itemName= itemName;
                this.price = price;
            }

        public void setName(String newName)
            {
                this.itemName = newName;
            }

        public String getName()
            {
                return itemName;
            }
        public int getItemID()
            {
                return itemID;
            }
        public int getInStore()
            {
                return inStore;
            }
        public double getPrice()
            {
                return price;
            }
    }
