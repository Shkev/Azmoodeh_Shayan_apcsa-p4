public class RaySumLast
{
	public static int go(int[] ray)
	{
		boolean good = false;
		int last = ray[ray.length - 1];
		int sum = 0;
		for (int num : ray)
		{
			if (num > last)
			{
				sum += num;
				good = true;
			}
		}
		if (good == true) return sum;
		return -1;
	}
}