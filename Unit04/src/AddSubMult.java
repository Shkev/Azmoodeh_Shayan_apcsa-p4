//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check(double a, double b)
	{
		double tmp = 0.0;
		if (a > b)
		{
			tmp = a - b;
		}
		if (a < b)
		{
			tmp = b - a;
		}
		if (a == b)
		{
			tmp = b * a;
		}
		return tmp;
	}
}