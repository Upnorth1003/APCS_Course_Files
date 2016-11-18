package Module07.Mod07Assignments.DeclaringStaticMethods702;
/**
 * This program converts to and from English and metric units of measure.
 * 
 * @author Tyler Spurr
 * @version 11/15/16
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 1.60934;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km *.621371;
    } 
    
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double lb)
    {
        return lb * 0.453592;
    } 
    
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kg)
    {
        return kg * 2.20462;
    }

    public static double convertGallonstoLiters(double gl)
        {
            return gl * 3.78541;
        }

    public static double convertLitersToGallons(double li)
        {
            return li * 0.264172;
        }

    public static double convertFeetToCentimeters(double ft)
        {
            return ft * 30.48;
        }
    
    public static double convertCentimetersToFeet(double cm)
        {
            return cm * 0.0328084;
        }

        
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method

        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
       
        kilograms = 98;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg. = %7.1f lb. %n", kilograms, pounds);
        
        double gallons = 55;
        double liters = convertGallonstoLiters(gallons);
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters);
        
        liters = 2;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons);

        double centimeters = 35;
        feet = convertCentimetersToFeet(centimeters);
        System.out.printf("%8.1f cm. = %7.1f ft. %n", centimeters, feet);

        feet = 3;
        centimeters = convertFeetToCentimeters(feet);
        System.out.printf("%8.1f ft. = %7.1f cm. %n", feet, centimeters);

           
    }//end of main method
	
}//end of class


