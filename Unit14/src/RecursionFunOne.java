//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		int digit = num % 10;
		if(num != 0)
		{
			num /= 10;
			if(digit % 2 == 0)
			{
				return 1 + countEvenDigits(num);
			}
			else
			{
				return 0 + countEvenDigits(num);
			}
		}
		return 0;
	}
}