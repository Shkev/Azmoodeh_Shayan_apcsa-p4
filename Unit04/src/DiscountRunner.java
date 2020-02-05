//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		double amt;
		
		for(int i = 0; i < 5; i++)
		{
			out.print("Enter the original bill amount :: ");
			amt = keyboard.nextDouble();
			out.printf("Bill after discount :: %.2f\n", Discount.getDiscountedBill(amt));
		}
	}
}