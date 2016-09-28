package Module03.Mod03Assignments.ProjectMona309;

import java.util.Scanner;

/**
 * Tyler Spurr
 * 9/28/16
 *
 */
public class Mona
    {

        public static void main(String[] args)
            {

                Scanner in = new Scanner(System.in);
                String lastName;
                String firstName;
                String phone;
                String dateOut;
                String daysOverDue;
                String dailyFine;
                String title;


                //Name
                System.out.print("Enter the name (last, first): ");
                lastName = in.next();
                firstName = in.nextLine();

                //Phone Number
                System.out.print("Enter the phone number (###)###-####: ");
                phone = in.next();

                //Title of Book
                System.out.print("Enther the title of the book: ");
                String word1 = in.next();           //First word
                String rest1 = in.nextLine();       //Rest of title
                title = word1 + rest1;

                //Date checked out
                System.out.print("Enter the date checked out (mm/dd/yyyy): ");
                dateOut = in.next();

                //Days overdue
                System.out.print("\tDays overdue: ");
                daysOverDue = in.next();

                //Daily fine
                System.out.print("\tDaily fine for book: ");
                dailyFine = in.next();

                System.out.println("--------------------Email--------------------\n\n");

                System.out.print("To: " + lastName + firstName + "(" + firstName.toLowerCase().substring(1, 2) + lastName.toLowerCase().substring(0, 4) + phone.substring(10 , 13) + "@csamediacenter.com\n");

                System.out.print("From; Mona (mona@csamediacenter.com\n");
                System.out.println("Subject: Overdure book");
                System.out.println("==============================================");
                System.out.println();

                System.out.print(title + " was checked out on: " + dateOut + "\n");
                System.out.print("The book is " + daysOverDue + " day(s) overdue!\n");

                System.out.println("The fine for the book is: $" + (Double.parseDouble(dailyFine) * Double.parseDouble(daysOverDue)));



            }

    }
