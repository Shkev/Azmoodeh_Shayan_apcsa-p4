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
		
		return 1;
	}

	public String toString()
	{
		String output="";
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < number; i++)
		{
			for (int j = 0; j < number; j++)
			{
				if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0))
				{
					continue;
				}
				for (int k = 0; k < number; k++)
				{
					if (c % 2 == 0)
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