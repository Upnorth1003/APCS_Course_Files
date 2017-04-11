package Module17.Mod17Assignments.Assignment1705;

/**
 * @author Tyler
 * @version 4/10/2017
 * @purpose show my knowledge of sorting algorithms
 */
public class TestItem
    {

        public static void main(String[] args)
            {

                Item[] hardware = new Item[6];
                hardware[0] = new Item(1011, "Air Filters", 200, 10.5);
                hardware[1] = new Item(1034, "Door KNobs", 60, 21.5);
                hardware[2] = new Item(1101, "Hammers", 90, 9.99);
                hardware[3] = new Item(1600, "Levels", 80,19.99);
                hardware[4] = new Item(1500, "Ceiling Fans", 100, 59);
                hardware[5] = new Item(1201, "Wrench Sets", 55, 80);

                System.out.println("Original Array: ");
                printInventory(hardware);

                System.out.println("Sorted by ID: ");
                hardware = sortID(hardware, 2);
                printInventory(hardware);

                System.out.println("Sorted by Name: ");
                hardware = sortName(hardware, 1);
                printInventory(hardware);

                System.out.println("Sorted by inStore: ");
                hardware = sortInStore(hardware, 2);
                printInventory(hardware);

                System.out.println("Sorted by Price: ");
                hardware = sortPrice(hardware, 1);
                printInventory(hardware);

            }

        public static void printInventory(Item[] hardware)
            {
                System.out.printf("%-8s %s %9s %7s\n", "itemID", "itemName", "inStore", "price");
                System.out.println("------------------------------------");

                for (int i = 0; i < hardware.length; i++)
                    {
                        System.out.printf("%-6d %-14s %-4d %2s %4.2f\n", hardware[i].getItemID(), hardware[i].getName(), hardware[i].getInStore(), "$", hardware[i].getPrice());
                    }

                System.out.println();
            }

        public static Item[] sortPrice(Item[] hardware, int oneOrTwo)
            {
                Item[] newlist = new Item[hardware.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getPrice() < newlist[k-1].getPrice())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=next;
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getPrice() < newlist[k-1].getPrice())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=hardware[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

        public static Item[] sortName(Item[] hardware, int oneOrTwo)
            {
                Item[] newlist = new Item[hardware.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                String next = hardware[i].getName();
                                int insert = 0;
                                int k =i;
                                while(k>0 && insert == 0)
                                    {
                                        if(next.compareTo( newlist[k-1].getName() ) > 0)
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = hardware[i];
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                String next = hardware[i].getName();
                                int insert = 0;
                                int k =i;
                                while(k>0 && insert == 0)
                                    {
                                        if(next.compareTo( newlist[k-1].getName() ) < 0)
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=hardware[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

        public static Item[] sortID(Item[] hardware, int oneOrTwo)
            {
                Item[] newlist = new Item[hardware.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getItemID() < newlist[k-1].getItemID())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=next;
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getItemID() > newlist[k-1].getItemID())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = hardware[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

        public static Item[] sortInStore(Item[] hardware, int oneOrTwo)
            {
                Item[] newlist = new Item[hardware.length];
                if(oneOrTwo == 1)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getInStore() < newlist[k-1].getInStore())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert]=next;
                            }
                        return newlist;
                    }
                else if (oneOrTwo == 2)
                    {
                        for(int i = 0; i < hardware.length; i++)
                            {
                                Item next = hardware[i];
                                int insert = 0;
                                int k =i;
                                while(k > 0 && insert == 0)
                                    {
                                        if(next.getInStore() > newlist[k-1].getInStore())
                                            {
                                                insert = k;
                                            }
                                        else
                                            {
                                                newlist[k] = newlist[k-1];
                                            }
                                        k--;
                                    }
                                newlist[insert] = hardware[i];
                            }
                        return newlist;
                    }
                else
                    {
                        return newlist;
                    }
            }

    }
