package frq2016.Problem3;

//class not given in problem; created to test code
public class Square 
{
	
	/** Constructs one square of a crossword puzzle grid.
	 *	Postcondition:
	 *	The square is black if and only if isBlack is true. - The square has number num.
	 */
	
	private boolean isBlack;
	private int label;
	
	public Square()
	{
		isBlack = true;
		label = 0;
	}
	
	public Square(boolean black, int num)
	{
		isBlack = black;
		label = num;
	}
	
	public String toString()
	{
		String output = "";
		if(isBlack == true)
			output += "Black";
		else
		{
			output += "White" + String.format("Label: %d", label);
		}
		return output + "\n";
	}
}
