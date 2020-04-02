//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "x", "9", "2", "7"};
		Grid test = new Grid(20, 20, vals);
		System.out.print(test);
		System.out.println(test.findMax(vals) + " occurs the most\n\n");
		
		Grid test2 = new Grid(10, 10, vals);
		System.out.print(test2);
		System.out.println(test2.findMax(vals) + " occurs the most");
		
	}
}