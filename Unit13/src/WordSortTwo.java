//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;
	
	public WordSortTwo()
	{
		wordRay = null;
	}

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for(int i = 0; i < wordRay.length; i++)
		{
			for(int j = i+1; j < wordRay.length; j++)
			{
				if(wordRay[i].compareTo(wordRay[j]) > 0)
				{
					//swapping values
					String tmp = wordRay[i];
					wordRay[i] = wordRay[j];
					wordRay[j] = tmp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(String word : wordRay)
		{
			output += word + "\n";
		}
		return output+"\n\n";
	}
}