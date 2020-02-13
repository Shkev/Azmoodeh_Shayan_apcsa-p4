import static java.lang.System.*;

import java.util.Arrays;
import java.util.Arrays.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		String back = "";
		for (int i = word.length() - 1; i >= 0; i--)
		{
			back = back + word.charAt(i);
		}
		return back;
	}

 	public String toString()
 	{
 		return getBackWards();
	}
}