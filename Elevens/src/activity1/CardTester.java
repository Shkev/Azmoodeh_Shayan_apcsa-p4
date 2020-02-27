package activity1;
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
		Card king = new Card("King", "Hearts", 10);
		Card ace = new Card("Ace", "Spades", 1);
		Card one = new Card("One", "Diamonds", 1);
		System.out.println(king);
		System.out.println(ace);
		System.out.println(one);
	}
}
