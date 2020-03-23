//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
    public static void main( String args[] ) throws IOException
    {
	Scanner file = new Scanner(new File("words.dat"));

	int size = file.nextInt();
	file.nextLine();
	String[] words = new String[size];
	for(int i = 0; i < size; i++)
	{
	    words[i] = file.nextLine();
	}
	Arrays.sort(words, ((String a, String b) ->
			    {
				Word a1 = new Word(a);
				Word b1 = new Word(b);
				return a1.compareTo(b1);
			    })
		    );
	for(String word : words)
	{
	    System.out.println(word);
	}	
   }
}
