import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(in);
	   WordsCompare compare = new WordsCompare();
	   String one, two;
	   for (int i = 0; i < 8; i++)
	   {
		   out.println("Enter two words :: ");
		   one = keyboard.next();
		   two = keyboard.next();
		   compare.setWords(one, two);
		   compare.compare();
		   out.print(compare);
	   }
   }
}