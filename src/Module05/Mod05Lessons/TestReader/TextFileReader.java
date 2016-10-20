package Module05.Mod05Lessons.TestReader;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      String token;
      File fileName = new File("D:\\Repositories\\APCS_Course_Files\\src\\Module05\\Mod05Lessons\\TestReader\\data6.txt");
      Scanner inFile = new Scanner(fileName);
      while (inFile.hasNext())
      {
         token = inFile.nextLine();
         System.out.println(token);
      }
      inFile.close();
    }//end of main method
}//end of class 