package Module15.Mod15Assignments.Assignment1505;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler Spurr
 * @version 3/12/2017
 * @purpose Implement what I have learned so far in 15
 */
public class InventoryDemo
    {

        public static void takeInventory(String name, List<Product> product)
            {
                double sumCost = 0;
                int quantity = 0;

                for (int i = 0; i < product.size(); i++)
                    {

                        if (name.equals(product.get(i).getName()))
                            {
                                quantity++;
                                sumCost += product.get(i).getCost();
                            }

                    }

                System.out.println(name + " Quantity = " + quantity + ", Total cost = " + sumCost);
            }

        public static void main(String[] args)
            {

                List<Product> products = new ArrayList<>();
                Car jaguar = new Car("Jaguar", 100000);
                Car neon = new Car("Neon", 17000);
                Tool jigsaw = new Tool("JigSaw", 149.18);
                Car jaguar2 = new Car("Jaguar", 110000);
                Car neon2 = new Car("Neon", 17500);
                Car neon3 = new Car("Neon", 17875.32);
                Truck ram = new Truck("RAM", 35700);
                Tool circularSaw = new Tool("CircularSaw", 200);
                Tool circularSaw2 = new Tool("CircularSaw", 150);

                products.add(jaguar);
                products.add(neon);
                products.add(jigsaw);
                products.add(jaguar2);
                products.add(neon2);
                products.add(neon3);
                products.add(ram);
                products.add(circularSaw);
                products.add(circularSaw2);


                takeInventory("Jaguar", products);
                takeInventory("Neon", products);
                takeInventory("JigSaw", products);
                takeInventory("RAM", products);
                takeInventory("CircularSaw", products);


                if (circularSaw.compareTo(circularSaw2) == 0)
                    System.out.println("The saws are the same price");
                else if (circularSaw.compareTo(circularSaw2) == -1)
                    System.out.println("The second saw is more expensive");
                else
                    System.out.println("The fist saw is more expensive");


            }

    }
