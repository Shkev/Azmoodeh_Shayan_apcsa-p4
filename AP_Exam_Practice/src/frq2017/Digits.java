package frq2017;

import java.util.ArrayList;
import java.util.Collections;

public class Digits
{
	/** The list of digits from the number used to construct this object.
	* The digits appear in the list in the same order in which they appear in the original number. */
	private ArrayList<Integer> digitList;
   
	/** Constructs a Digits object that represents num. * Precondition: num >= 0
    */
	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		while(num != 0)
		{
			digitList.add(num % 10);
			num /= 10;
		}
		Collections.reverse(digitList);
	}
   
   /** Returns true if the digits in this Digits object are in strictly increasing order; * false otherwise.
    */
   public boolean isStrictlyIncreasing()
   {
	   for(int i = 0; i+1 < digitList.size(); i++)
	   {
		   if(digitList.get(i+1) <= digitList.get(i))
		   {
			   return false;
		   }
	   }
	   return true;
   } 
}
