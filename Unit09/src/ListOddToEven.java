//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public int go( List<Integer> ray )
	{
		int output = -1;
		boolean found = false;
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 1)
			{
				for (int j = i; j < ray.size(); j++)
				{
					if (ray.get(j) % 2 == 0)
					{
						output = j - i;
					}
				}
				return output;
			}
		}
		return -1;
	}
}