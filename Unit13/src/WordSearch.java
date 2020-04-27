//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    
    public WordSearch()
    {
    	m = null;
    }

    public WordSearch( int size, String str )
    {
    	String[] letters = str.split("");
    	m = new String[letters.length/size][size];
    	int pos = 0;
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			m[i][j] = letters[pos];
    			pos++;
    		}
    	}
    }

    public boolean isFound(String word)
    {
    	for(int r = 0; r < m.length; r++)
    	{
    		for(int c = 0; c < m[r].length; c++)
    		{
    			if(checkRight(word, r, c) || checkLeft(word, r, c)
    					|| checkUp(word, r, c) || checkDown(word, r, c)
    					|| checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c)
    					|| checkDiagDownRight(word, r, c) || checkDiagDownLeft(word, r, c))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }

    //r is for the row, and c is for the column.
	public boolean checkRight(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c
		if(c + w.length() > m[0].length)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r][c+i].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c
		if(c + 1 - w.length() < 0)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r][c-i].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		//checking if the word fits on the board for the given r
		if(r + 1 - w.length() < 0)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r-i][c].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c
		if(r + w.length() > m.length)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r+i][c].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c and r
		if(c + w.length() > m[0].length)
			return false;
		if(r + 1 - w.length() < 0)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r-1][c+i].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c and r
		if(c + 1 - w.length() < 0)
			return false;
		if(r + 1 - w.length() < 0)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r-1][c-i].charAt(0))
				return false;
		}
		return true;	
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c and r
		if(c + 1 - w.length() < 0)
			return false;
		if(r + w.length() > m.length)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r+1][c-i].charAt(0))
				return false;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		//checking if the word fits on the board for the given c and r
		if(c + w.length() > m[0].length)
			return false;
		if(r + w.length() > m.length)
			return false;
		for(int i = 0; i < w.length(); i++)
		{
			if(w.charAt(i) != m[r+1][c+i].charAt(0))
				return false;
		}
		return true;
	}

    public String toString()
    {
    	//printing all values in matrix
    	String output = "";
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			output += m[i][j] + " ";
    		}
    		output += "\n";
    	}
 		return output;
    }
}
