//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word = "";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = 0; j < word.length() - i; j++)
			{
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
		System.out.println();
	}
}