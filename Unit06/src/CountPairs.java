import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int tmp = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (tmp == str.charAt(i))
			{
				count++;
			}
			tmp = str.charAt(i);
		}
		return count;
	}
}