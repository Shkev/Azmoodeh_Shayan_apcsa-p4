//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] arr = {one, two, three, four};
		double max = arr[0];
		for (int i  = 0; i < arr.length-1; i++)
		{
			if (Math.max(arr[i], arr[i+1]) > max)
			{
				max = Math.max(arr[i], arr[i+1]);
			}
		}
		return max;
	}

	public String toString()
	{
	   return String.format("%f %f %f %f\n", one, two, three, four) + "\nbiggest = "+getBiggest()+"\n";
	}
}