package Module17.Mod17Assignments.Assignment1706;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
		{
			Card queen = new Card("King","Spades",13);
			Card ace = new Card("Ace","Diamonds",1);
			Card ten = new Card("8","Clubs",8);

			System.out.println("Are Aces and Queens the same?");
			System.out.println(ace.matches(queen));
			System.out.println();

			System.out.println(ace.toString());
			System.out.println(ten.toString());
			System.out.println(queen.toString());
			System.out.println();

			System.out.println("Are Tens the same?");
			System.out.println(ten.matches(ten));
		}
}
