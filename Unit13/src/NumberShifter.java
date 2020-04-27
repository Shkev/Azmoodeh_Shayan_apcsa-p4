//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] Lucky7Array = new int[size];
		for(int i = 0; i < size; i++)
		{
			Lucky7Array[i] = (int)(Math.random() * 10);
		}
		return Lucky7Array;
	}
	public static void shiftEm(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i+1; j < array.length; j++)
			{
				if(array[j] == 7)
				{
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
}