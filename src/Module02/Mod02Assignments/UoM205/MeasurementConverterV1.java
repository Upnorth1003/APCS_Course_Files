package Module02.Mod02Assignments.UoM205;
/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Tyler Spurr
 * Date: 9/15/16
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        double kilograms;                //weight in kilograms
        double poundsPerKilogram = 2.20462; // amount of pounds in a kilogram
        double pounds;                  //weight in pounds
        double gallons;                 //amount in gallons
        double litersPerGallon = 3.78541; //amount of liters in a gallon
        double kilometers;              //distance in kilometers
        double milesPerKilometer = .621371; //amount of miles per kilometer
        double liters;                  //amount in liters
        double yard;                    //distance in yards
        double feetPerYard = 3.0;       //amount of feet in a yard
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable

        System.out.println("**************************************");
        System.out.println("        This program converts         ");
        System.out.println("         between measurements         ");
        System.out.println("**************************************");

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 3;
        feet = miles * feetPerMile;
        System.out.println(miles + "mi. = " + feet + "ft.");
        System.out.println();

        //miles to kilometers
        miles = 3;
        kilometers = miles / milesPerKilometer;
        System.out.println(miles + "mi. = " + kilometers + "km.");

        //kilometers to miles
        kilometers = 12;
        miles = kilometers * milesPerKilometer;
        System.out.println(kilometers + "km. = " + miles + "mi.");
        System.out.println();

        //pounds to kilograms
        pounds = 145;
        kilograms = pounds / poundsPerKilogram;
        System.out.println(pounds + "lb. = " + kilograms + "kg.");

        //kilograms to pounds
        kilograms = 100;
        pounds = kilograms * poundsPerKilogram;
        System.out.println(kilograms + "kg. = " + pounds + "lb.");
        System.out.println();

        //gallons to liters
        gallons = 25;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + "gal. = " + liters + "L");

        //liters to gallons
        liters = 26.2;
        gallons = liters / litersPerGallon;
        System.out.println(liters + "L. = " + gallons + "gal.");
        System.out.println();

        //My Choosing (Feet to yards)
        feet = 23.215;
        yard = feet / feetPerYard;
        System.out.println(feet + "ft. = " + yard + "yds.");

        //Yards into feet
        yard = 3.5;
        feet = yard * feetPerYard;
        System.out.println(yard + "yrds. = " + feet + "ft.");





    }//end of main method
}//end of class

