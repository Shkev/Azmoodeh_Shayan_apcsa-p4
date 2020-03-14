//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.Math;

public class Rational implements Comparable<Rational>, Cloneable
{
	int numerator;
	int denominator;

	public Rational()
	{
		setRational(1, 1);
	}

	public Rational(int num, int den)
	{
		setRational(num, den);
	}

	public void setRational(int num, int den)
	{
		setNumerator(num);
		setDenominator(den);
	}

	public void setNumerator(int num)
	{
		numerator = num;
	}

	public void setDenominator(int den)
	{
		denominator = den;
	}

	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void add(Rational other)
	{
		//num1/den1 + num2/den2
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
		denominator = denominator * other.getDenominator();
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0;
		for(int i = (int)Math.min(numOne, numTwo); i > 0; i--)
		{
			if(numOne % i == 0 && numTwo % i == 0)
			{
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	public Object clone()
	{
		try
		{
			return (Rational)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning not allowed. ");
			return this;
		}
	}

	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Rational rational = (Rational) obj;
		reduce();
		rational.reduce();
		return numerator == rational.getNumerator() && denominator == rational.getDenominator();
	}

	public int compareTo(Rational other)
	{
		float frac1 = (float)numerator/denominator;
		float frac2 = (float)other.getNumerator() / other.getDenominator();
		if(frac1 > frac2) return 1;
		if(frac1 < frac2) return -1;
		return 0;
	}

	public String toString()
	{
		return numerator + "/" + denominator;
	}
}
