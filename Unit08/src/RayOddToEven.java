public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int output = -1;
		boolean first = false;
		for (int num : ray)
		{
			if(first == false && num % 2 == 1)
			{
				output = num;
				first = true;
			}
			else if (first == true)
			{
				if(num % 2 == 0)
					output = Math.abs(output - num);
			}
		}
		if(first == false)
		{
			return -1;
		}
		return output;
	}
}