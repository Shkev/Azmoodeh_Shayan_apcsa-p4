//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 0;
		for (int i = 1; i <= a; i++)
		{
			if (i > b || i > c) break;
			if (a % i == 0 && b % i == 0 && c % i == 0)
				gcd = i;
		}
		return gcd;
	}

	public String toString()
	{
		String output="";
		int a = 0, b = 0, c = 0;
		for (int i = 1; i < number; i++)
		{
			for (int j = i; j < number; j++)
			{
				if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0))
				{
					continue;
				}
				for (int k = j; k < number; k++)
				{
					if (k % 2 == 0 || greatestCommonFactor(i, j, k) > 1)
					{
						continue;
					}
					if (Math.pow(i, 2) + Math.pow(j, 2)== Math.pow(k,2))
					{
						a = i;
						b = j;
						c = k;
						output = output + a + " " + b + " " + " " + c + "\n"; 
					}
				}
			}
		}

		return output+"\n";
	}
}