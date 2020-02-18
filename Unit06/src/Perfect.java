//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect()
	{
		setNum(0);
	}
	public Perfect(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i < number; i++)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		if (sum == number) return true;
		return false;
	}

	public String toString()
	{
		boolean perfect = isPerfect();
		if (perfect == true)
			return number + " is perfect\n";
		else
			return number + " is not perfect\n";
	}
	
}