//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		mph=0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = (double)distance / (hours + (double)minutes/60);
	}

	public void print()
	{
		out.printf("%d miles in %d hours and %d minutes = %.0f MPH.\n", distance, hours, minutes, mph);
	}
	
	
	//create a print or toString or both
	
	public String toString()
	{
		return "" + distance + " miles in " + hours + " hours and " + minutes + " minutes = " + mph + " MPH.";
	}
}