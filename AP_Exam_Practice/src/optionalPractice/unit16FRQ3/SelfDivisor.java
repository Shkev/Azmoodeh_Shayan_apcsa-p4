package optionalPractice.unit16FRQ3;

import java.util.Arrays;

public class SelfDivisor 
{
	
	/** Checks a number to see if it is a self divisor.
	 * 	A number is a self divisor if it is divisible
	 * 	by all of its digits.
	 *  @param number is the number to be tested
	 *  @return true is number is a self divisor and false otherwise
	 *  */
	public static boolean isSelfDivisor(int number)
	{
		int tmp = number;
		while(tmp != 0)
		{
			int digit = tmp % 10;
			tmp /= 10;
			if(digit == 0 || number % digit != 0)
				return false;
		}
		return true;
	}
	
	/** @param start starting point for values to be checked
	 * 	@param num the size of the output array
	 * 	@return an array containing the first num integers >= start.
	 *  */
	public static int[] firstNumSelfDivisors(int start, int num)
	{
		int[] output = new int[num];
		int i = 0;
		while(i < num)
		{
			if(isSelfDivisor(start))
			{
				output[i] = start;
				i++;
			}
			start++;
		}
		return output;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3)));
	}
	
}
