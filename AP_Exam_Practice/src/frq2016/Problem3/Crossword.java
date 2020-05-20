package frq2016.Problem3;

public class Crossword 
{
	
	/** Each element is a Square object with a color (black or white) and a number. 
	 * 	puzzle[r][c] represents the square in row r, column c.
	 * 	There is at least one row in the puzzle.
	 */
	
	private Square[][] puzzle;
	
	/** Constructs crossword puzzle grid
	 *	Precondition: There is at least one row in blackSquares. 
	 *	Square at blackSquares[r][c] is black if and only if the value of
	 *	blackSquares is true.
	 */
	
	public Crossword(boolean[][] blackSquares)
	{
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int label = 1;
		for(int r = 0; r < puzzle.length; r++)
		{
			for(int c = 0; c < puzzle[r].length; c++)
			{
				if(blackSquares[r][c])
					puzzle[r][c] = new Square(true, 0);
				else if(toBeLabeled(r, c, blackSquares))
				{
					puzzle[r][c] = new Square(false, label);
					label++;
				}
				else if(!toBeLabeled(r, c, blackSquares))
				{
					puzzle[r][c] = new Square(false, 0);
				}
			}
		}
	}
	
	/** Returns true if the square at row r, column c should be labeled with a positive number; 
	 * false otherwise.
	 * @param r
	 * @param c
	 * @param blackSquares
	 */
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{
		if(blackSquares[r][c] == true)
			return false;
		if(r != 0 && blackSquares[r-1][c])
		{
			return true;
		}
		if(c != 0 && blackSquares[r][c-1])
		{
			return true;
		}
		return false;
	}
	
	//to test code
	public static void main(String[] args)
	{
		boolean[][] blackSquares = new boolean[2][2];
		blackSquares[0][0] = true;
		Crossword test = new Crossword(blackSquares);
		
		for(Square[] row : test.puzzle)
			for(Square sq : row)
				System.out.println(sq);
	}
	
}
