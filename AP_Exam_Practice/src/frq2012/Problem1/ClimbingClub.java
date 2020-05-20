package frq2012.Problem1;

import java.util.List;
import java.util.ArrayList;

public class ClimbingClub 
{
	
	/** The list of climbs completed by members of the club.
	 * Guaranteed not to be null. Contains only non-null references. */
	private List<ClimbInfo> climbList;
	
	/** Creates a new ClimbingClub object. */
	public ClimbingClub()
	{
		climbList = new ArrayList<ClimbInfo>();
	}
	
	/** Adds a new climb with name peakName and time climbTime to the list of climbs
	 * in alphabetical order.
	 * @param peakName the name of the mountain peak climbed
	 * @param climbTime the number of minutes taken to complete the climb
	 */
	/*public void addClimb(String peakName, int climbTime)
	{
		ClimbInfo entry = new ClimbInfo(peakName, climbTime);
		int index = 0;
		for(int i = 0; i < climbList.size(); i++)
		{
			if(peakName.compareTo(climbList.get(i).getName()) > 0)
				index++;
		}
		if(index == climbList.size())
			climbList.add(entry);
		else
			climbList.add(index, entry);
	}*/
	
	/**Alternate Code*/
	public void addClimb(String peakName, int climbTime)
	{
		ClimbInfo entry = new ClimbInfo(peakName, climbTime);
		for(int i = 0; i < climbList.size(); i++)
		{
			if(peakName.compareTo(climbList.get(i).getName()) <= 0)
			{
				climbList.add(i, entry);
				return;
			}
		}
		climbList.add(entry);
	}
	
	public int distinctPeakNames()
	{
		if (climbList.size() == 0) 
		{
			return 0; 
		}
		
		ClimbInfo currInfo = climbList.get(0); String prevName = currInfo.getName(); String currName = null;
		int numNames = 1;
		
		for (int k = 1; k < climbList.size(); k++) 
		{
			currInfo = climbList.get(k);
			currName = currInfo.getName();
			if(prevName.compareTo(currName) != 0)
			{
				numNames++;
				prevName = currName;
			}
		}
		return numNames;
	}
	
	public static void main(String[] args)
	{
		ClimbingClub hikerClub = new ClimbingClub(); 
		hikerClub.addClimb("Monadnock", 274); 
		hikerClub.addClimb("Whiteface", 301); 
		hikerClub.addClimb("Algonquin", 225); 
		hikerClub.addClimb("Monadnock", 344);
		int numNames = hikerClub.distinctPeakNames();
		
		System.out.println(numNames);
		
		for(ClimbInfo item : hikerClub.climbList)
		{
			System.out.println(item);
		}
	}
	
}
