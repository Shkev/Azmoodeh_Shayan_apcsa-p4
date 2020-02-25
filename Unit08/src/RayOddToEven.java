public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int output = -1;
		boolean found = false;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 == 1)
			{
				for (int j = i; j < ray.length; j++)
				{
					if (ray[j] % 2 == 0)
					{
						output = j - i;
						found = true;
						break;
					}
				}
			}
			if (found == true) break;
		}
		return output;
	}
}