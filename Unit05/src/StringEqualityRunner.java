import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		StringEquality Compare = new StringEquality();
		String one, two;
		for (int i = 0; i < 8; i-=-1)
		{
			out.println("Enter two words :: ");
			one = keyboard.next();
			two = keyboard.next();
			Compare.setWords(one, two);
			out.print(Compare);
		}
	}
}