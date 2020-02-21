//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String printPattern()
	{
		String output = "";
		char ch;
		for (int i = 0; i < amount; i++)
		{
			ch = letter;
			for (int j = i; j < amount; j++)
			{
				for (int k = j - i; k < amount; k++)
				{
					output = output + ch;
				}
				output = output + " ";
				if (ch != 'Z')
					ch++;
				else
					ch = 'A';
			}
			output = output + "\n";
		}
		return output;
	}

	public String toString()
	{
		return printPattern();
	}
}