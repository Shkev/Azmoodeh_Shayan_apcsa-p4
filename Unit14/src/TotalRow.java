//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> rowSums = new ArrayList<Integer>();
    	int sum = 0;
    	for(int[] row : m)
    	{
    		sum = 0;
    		for(int num : row)
    		{
    			sum += num;
    		}
    		rowSums.add(sum);
    	}
		return rowSums;
    }
}
