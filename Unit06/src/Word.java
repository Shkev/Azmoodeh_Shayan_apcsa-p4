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
		String back;
		char ch[] = new char[word.length()];
		int j = 0;
		for (int i = word.length() - 1; i >= 0; i--)
		{
			ch[i] = word.charAt(j);
			j++;
		}
		back = Arrays.toString(ch);
		return back;
	}

 	public String toString()
 	{
 		return "";
	}
}