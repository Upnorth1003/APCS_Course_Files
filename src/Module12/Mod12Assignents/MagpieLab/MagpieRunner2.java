package Module12.Mod12Assignents.MagpieLab;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}

		System.out.println(maggie.findKeyword( "She’s my sister",  "sister", 0));
		System.out.println(maggie.findKeyword( "Brother Tom is helpful",  "brother", 0));
		System.out.println(maggie.findKeyword( "I can't catch wild cats.",  "cat", 0));
		System.out.println(maggie.findKeyword( "I know nothing about snow plows.",  "no", 0));



	}

}
