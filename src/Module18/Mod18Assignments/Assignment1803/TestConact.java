package Module18.Mod18Assignments.Assignment1803;

/**
 * @author Tyler
 * @version 4/15/2017
 * @purpose challenge program over search algos
 */
public class TestConact
    {

        public static void main(String[] args)
            {

                Contact[] myContacts = new Contact[6];
                myContacts[0] = new Contact("John Carter","brother","Mar 3","(342)555-7069","jcarter@carter.com");
                myContacts[1] = new Contact("Elise Carter","mom","Apr 19","(342)555-7011","carterMom@carter.com");
                myContacts[2] = new Contact("Ellie Carter","me","Jun 10","(342)555-8102","ecarter@carter.com");
                myContacts[3] = new Contact("Sue Ellen","friend","Mar 9","(341)555-9182","susieE@hotmail.com");
                myContacts[4] = new Contact("Frank Carter","dad","Dec 1","(342)555-7011","carterDad@carter.com");
                myContacts[5] = new Contact("Johnnie","friend","Jan 21","(341)555-7789","jDawg5555@yahoo.com");

                printContacts(myContacts);

                System.out.println("Find Name - Johnnie");
                myContacts = sortNames(myContacts);
                findByName(myContacts, "Johnnie");

                System.out.println("Find Name - Sam Parker");
                findByName(myContacts, "Sam Parker");

                System.out.println("Find Relation - friend");
                findByRelation(myContacts, "friend");

                System.out.println("Find Relation - Aunt");
                findByRelation(myContacts, "Aunt");

                System.out.println("Find Phone - (333)555-8989");
                findByPhone(myContacts, "333)555-8989");

                System.out.println("Find Phone - (342)555-7011");
                findByPhone(myContacts, "(342)555-7011");

                System.out.println("Find Birthday - May");
                findByBMonth(myContacts, "May");

                System.out.println("Find Birthday - Mar");
                findByBMonth(myContacts, "Mar");

                System.out.println("Find Email - rgoodman#hotmail.com");
                myContacts = sortEmail(myContacts);
                findByEmail(myContacts, "rgoodman#hotmail.com");

                System.out.println("Find Email - susieE@hotmail.com");
                findByEmail(myContacts, "susieE@hotmail.com");


            }


        public static void printContacts(Contact[] myContacts)
            {
                System.out.println("\t\t\t\t\t\t  Contact List\n\n");
                System.out.printf("%-15s %-10s %-16s %-16s %s\n", "Name", "Relation", "Birthday", "Phone", "Email");
                System.out.println("----------------------------------------------------------------------------");
                for (int i = 0; i < myContacts.length; i++)
                        System.out.println(myContacts[i]);

                System.out.println();

            }

        public static Contact[] sortNames(Contact[] myContacts)
            {
                Contact[] newlist = new Contact[myContacts.length];
                for(int i = 0; i < myContacts.length; i++)
                    {
                        String next = myContacts[i].getName();
                        int insert = 0;
                        int k =i;
                        while(k>0 && insert == 0)
                            {
                                if(next.compareTo(newlist[k-1].getName()) > 0)
                                    {
                                        insert = k;
                                    }
                                else
                                    {
                                        newlist[k] = newlist[k-1];
                                    }
                                k--;
                            }
                        newlist[insert]=myContacts[i];
                    }
                return newlist;
            }

        public static void findByName(Contact[] myContacts, String name )
            {
                int high = myContacts.length;
                int low = -1;
                int probe;
                while ( high - low > 1 )
                    {
                        probe = ( high + low ) / 2;
                        if ( myContacts[probe].getName().compareTo(name) > 0)
                            {
                                high = probe;
                            }
                        else
                            {
                                low = probe;
                            }
                    }
                if ( (low >= 0) && (myContacts[low].getName().compareTo(name) == 0 ))
                    {
                        System.out.println("Found: " + myContacts[low]);
                        System.out.println();
                    }
                else
                    {
                        System.out.println("No Contact Found");
                        System.out.println();
                    }
            }

        public static void findByRelation(Contact[] myContacts, String relation)
            {
                int found = 0;
                for (int i = 0; i < myContacts.length; i++)
                    {
                        if (myContacts[i].getRelation().compareTo(relation) == 0)
                            {
                                found++;
                                System.out.println(myContacts[i]);
                            }
                    }

                if (found == 0)
                    {
                        System.out.println("Contact(s) not found.");
                        System.out.println();
                    }
                else
                    {
                        System.out.println("Found " + found + " contacts with " + relation + " relation.");
                        System.out.println();
                    }
            }

        public static void findByPhone(Contact[] myContacts, String phone)
            {
                int found = -1;
                for (int i = 0; i < myContacts.length; i++)
                    {
                        if (myContacts[i].getPhone().compareTo(phone) == 0)
                            {
                                found = i;
                                break;
                            }
                    }

                if (found == -1)
                    {
                        System.out.println("Contact not found.");
                        System.out.println();
                    }
                else
                    {
                        System.out.println("Found: " + myContacts[found]);
                        System.out.println();
                    }
            }

        public static void findByBMonth(Contact[] myContacts, String bday)
            {
                int found = 0;
                for (int i = 0; i < myContacts.length; i++)
                    {
                        //System.out.println(myContacts[i].getBday().substring(0, 2));
                        if (myContacts[i].getBday().substring(0, 3).compareTo(bday) == 0)
                            {
                                found++;
                                System.out.println(myContacts[i]);
                            }
                    }

                if (found == 0)
                    {
                        System.out.println("No contact(s) found.");
                        System.out.println();
                    }
                else
                    {
                        System.out.println("Found " + found + " contacts with " + bday + " birth month.");
                        System.out.println();
                    }
            }

        public static Contact[] sortEmail(Contact[] myContacts)
            {
                Contact[] newlist = new Contact[myContacts.length];
                for(int i = 0; i < myContacts.length; i++)
                    {
                        String next = myContacts[i].getEmail();
                        int insert = 0;
                        int k =i;
                        while(k>0 && insert == 0)
                            {
                                if(next.compareTo( newlist[k-1].getEmail() ) > 0)
                                    {
                                        insert = k;
                                    }
                                else
                                    {
                                        newlist[k] = newlist[k-1];
                                    }
                                k--;
                            }
                        newlist[insert]=myContacts[i];
                    }
                return newlist;
            }

        public static void findByEmail(Contact[] myContacts, String email )
            {
                int high = myContacts.length;
                int low = -1;
                int probe;
                while (high - low > 1)
                    {
                        probe = (high + low) / 2;
                        if ( myContacts[probe].getEmail().compareTo(email) > 0)
                            {
                                high = probe;
                            }
                        else
                            {
                                low = probe;
                            }
                    }
                if ( (low >= 0) && (myContacts[low].getEmail().compareTo(email) == 0 ))
                    {
                        System.out.println("Found: " + myContacts[low]);
                        System.out.println();
                    }
                else
                    {
                        System.out.println("No contact(s) found:");
                        System.out.println();
                    }
            }

    }
