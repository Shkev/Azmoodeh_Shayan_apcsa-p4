import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("", "");
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality()
	{
		if (wordOne.equals(wordTwo))
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		String output;
		if (checkEquality())
			output = wordOne + " has the same letters as " + wordTwo + "\n";
		else
			output = wordOne + " does not have the same letters as " + wordTwo + "\n";
		return output;
	}
}