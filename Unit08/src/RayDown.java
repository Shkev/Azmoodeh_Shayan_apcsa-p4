public class RayDown
{
	public static boolean go(int[] numArray)
	{
		boolean dec = true;
		for (int i = 1; i < numArray.length; i++)
		{
			if (numArray[i] > numArray[i-1])
				dec = false;
		}
		return dec;
	}	
}