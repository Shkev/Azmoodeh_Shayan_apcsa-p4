package activity4;
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
	
	private static String[] suits2 = {"Diamonds", "Hearts", "Clubs", "Spades"};
	private static String[] ranks2 = {"2", "3", "4", "K"};
	private static int[] pointValues2 = {2, 3, 4, 10};
	
	private static String[] suits3 = {"Diamonds", "Hearts", "Spades", "Spades"};
	private static String[] ranks3 = {"J", "Q", "A", "K", "2"};
	private static int[] pointValues3 = {10, 10, 11, 10, 2};
	
	public static void main(String[] args) 
	{
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		Deck deck3 = new Deck(ranks3, suits3, pointValues3);
		
		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);
	}
}
