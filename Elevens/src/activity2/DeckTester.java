package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	
	private static String[] suits1 = {"Diamonds", "Clubs", "Hearts", "Spades"};
	private static String[] ranks1 = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	private static int[] pointValues1 = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	
	public static void main(String[] args) 
	{
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		Deck deck2 = new Deck();
		Deck deck3 = new Deck();
		
		System.out.println(deck1);
	}
}
