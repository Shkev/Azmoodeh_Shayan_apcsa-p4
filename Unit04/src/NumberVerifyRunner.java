//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		int num;
		for (int i = 0; i < 3; i++)
		{
			Scanner keyboard = new Scanner(in);
			out.print("Enter integer :: ");
			num = keyboard.nextInt();
			System.out.printf("%d is odd :: " + NumberVerify.isOdd(num) + "\n", num);
			System.out.printf("%d is even :: " + NumberVerify.isEven(num) + "\n\n", num);
		}
	}
}