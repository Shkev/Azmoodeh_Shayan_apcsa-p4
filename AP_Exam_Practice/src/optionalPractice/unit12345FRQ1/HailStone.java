package optionalPractice.unit12345FRQ1;


public class HailStone 
{	
	
	/** Finds length of hailstone sequence starting with element n
	 * @param n is the starting element in the sequence.
	 * @return length of sequence starting with n */
	public static int hailstoneLength(int n)
	{
		int count = 1;
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n = n/2;
			}
			else if(n % 2 == 1)
			{
				n = 3*n+1;
			}
			count++;
		}
		return count;
	}
	
	/** A sequence is "long" if its length is greater than its
	 * first element.
	 * @param n is first element of the desired sequence
	 * @return true if the sequence is long and false otherwise. */
	public static boolean isLongSequence(int n)
	{
		return hailstoneLength(n) > n;
	}
	
	/** @param n represents the range of sequences to check.
	 * Checks to see if each sequence starting with a value between
	 * 1 and n inclusive is long.
	 * @return The proportion of "long" sequences out of all the sequences
	 * checked (sequences with starting values between 1 and n inclusive)*/
	public static double propLong(int n)
	{
		int longCount = 0;
		for(int i = 1; i <= n; i++)
		{
			if(isLongSequence(i))
				longCount++;
		}
		return (double)longCount / n; //don't forget to cast to a double
	}
	
}
