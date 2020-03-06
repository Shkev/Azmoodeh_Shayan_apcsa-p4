import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		boolean found = false;
		int sum = 0;
		int firstVal = ray.get(0);
		for (int num : ray)
		{
			if(num > firstVal)
			{
				sum += num;
				found = true;
			}
		}
		if(found == true) return sum;
		return -1;
	}
}