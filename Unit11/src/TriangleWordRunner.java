//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		String word;
		String input;
		do
		{
			System.out.print("Enter a word :: ");
			word = scan.next();
			
			TriangleWord.printTriangle(word);
			
			System.out.print("\nDo you want to enter more sample input? ");
			input = scan.next();
		} while(input.equals("Y") || input.equals("y"));
	}
}