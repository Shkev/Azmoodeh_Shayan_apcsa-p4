//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] test = NumberShifter.makeLucky7Array(25);
		NumberShifter.shiftEm(test);
		System.out.println(Arrays.toString(test));
	}
}



