//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				int index = (int)(Math.random() * vals.length);
				grid[i][j] = vals[index];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		String maxVal = "";
		for(String val : vals)
		{
			max = Math.max(max, countVals(val));
			if(max == countVals(val))
				maxVal = val;
		}
		return maxVal;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(String[] rows : grid)
		{
			for(String item : rows)
			{
				if(item.equals(val))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(String[] rows : grid)
		{
			for(String item : rows)
			{
				output = output + " " + item;
			}
			output = output + "\n";
		}
		return output + "\n";
	}
}