package Module03.Mod03Lessons.AsciiEx302;

/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 */
public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        //cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        //int is used to change 'A' to its ASCII code
        System.out.println("The ASCII code for " + '9' + " is " + (int)'9');
        System.out.println();
        
        //cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        //char is used to change the ASCII number into a character.
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println();

        System.out.println(""+(char)83 + (char)101 + (char)110 + (char)100 + (char)32 + (char)121 + (char)111 + (char)117 + (char)114 + (char)32 + (char)116 + (char)101 + (char)97 + (char)99 + (char)104 + (char)101 + (char)114 + (char)32 +
                (char)97 + (char)110 + (char)32 + (char)101 + (char)109 + (char)97 + (char)105 + (char)108 + (char)32 + (char)116 + (char)111 + (char)100 + (char)97 +( char)121);
        
    }//end of main method
}//end of class
