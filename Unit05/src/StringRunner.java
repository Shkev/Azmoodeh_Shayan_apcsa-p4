import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		String input;
		StringOddOrEven test = new StringOddOrEven();
		for (int i = 0; i < 8; i++)
		{
			out.println("Enter a word ::");
			input = keyboard.next();
			test.setString(input);
			out.print(test);
		}
	}
}